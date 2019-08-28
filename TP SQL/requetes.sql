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


-- Afficher la liste des factures avec les différentes remises appliquées 
-- (1 ligne par remise avec 3 montants: hors remise, après remise, montant de la remise)


