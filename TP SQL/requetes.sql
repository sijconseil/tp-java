-- liste des factures remisées
select distinct fac.* 
from t_facture fac
	join t_ligne_facture l on fac.fac_id = l.fac_id
where (lif_remise_pourcent is not null or lif_remise_montant is not null)

-- liste des client situés dans le département des bouches du rhône
select distinct * 
from t_client cli
	join t_adresse adr on adr.cli_id = cli.cli_id
where adr.adr_cp like '13%'

-- CA Q4 2000
-- premiere exemple avec un like sur la date en format


-- second exemple avec une extraction du champ dans la date



-- clients avec noms et prénoms concaténés qui ont des factures d'un montant inférieur ou égal à 300€



-- liste des clients ayant un téléphone fixe mais n'ayant pas de mobile
select distinct cli_id from t_telephone where typ_code = 'TEL'
except 
select distinct cli_id from t_telephone where typ_code = 'GSM'

-- autre solution à base de jointure ouverte
select distinct fixe.cli_id 
from (select cli_id from t_telephone where typ_code ='TEL') fixe
  left join (	select cli_id from t_telephone where typ_code ='GSM') mob
	on fixe.cli_id = mob.cli_id
where mob.cli_id is null;

-- liste des chambres "3 personnes" qui sont à l’étage
select * from t_chambre where chb_etage <> 'RDC' and chb_couchage = 3

-- liste des chambres dont l’id est différent du numéro (héhé)
select * from t_chambre where chb_id <> chb_numero

-- liste des chambres qui n’ont qu’une douche
select * from t_chambre where chb_bain = 0 and chb_douche = 1

-- liste des chambres dont le tarif est inférieur à 240 € ou qui ont au moins 3 places.



-- Afficher les clients avec le numéro de téléphone mobile et à défaut le téléphone fixe


-- Afficher la listes des clients dans une colonne contenant l’enseigne 
-- et le nom/prénom s’il n’y a pas d’enseigne

-- REMARQUE : les deux requêtes suivantes aboutissent au même plan d'exécution
-- il est donc possible de modifier son code sans pénaliser le temps d'exécution pour qu'il soit plus facile
-- à lire, écrire, valider ou réutiliser. 
-- select * from (select * from (select * from t_client where cli_id >1) c2) c where tit_code = 'Mme.';
-- select * from t_client where cli_id >1 and tit_code = 'Mme.';


-- Afficher la liste des factures avec les différentes remises appliquées 
-- (1 ligne par remise avec 3 montants: hors remise, après remise, montant de la remise)
select sub2.fac_id, f.pmt_code,
	sum(sub2.ttc) as "ttc brut", 
	sum(sub2.ttc_remise) as "ttc remisé", 
	sum(sub2.ttc - sub2.ttc_remise) as "montant de la remise"
from t_facture f
	join (

		select sub1.ttc*(1-sub1.rempct/100) - sub1.remabs as ttc_remise, sub1.*
		from	(select lif_id as id, fac_id, 
				lif_montant * (1+lif_taux_tva) * lif_qte as ttc,  -- en supposant que le montant fourni est HT
				coalesce(lif_remise_pourcent,0) as rempct, coalesce(lif_remise_montant,0) as remabs
			from t_ligne_facture) sub1
	) sub2 on f.fac_id = sub2.fac_id
group by sub2.fac_id, f.pmt_code;



