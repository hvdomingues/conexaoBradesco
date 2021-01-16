
INSERT INTO category (category_id, category_name) VALUES
  (1,'Moda'),
  (2,'Mercados'),
  (3,'Farmácia'),
  (4,'Bebidas');



INSERT INTO adress (adress_id,street, neighborhood, state, number, city, cep) VALUES
  (1,'Embira','Jd Cleusa', 'SP', '269', 'São Paulo', '03546000');




INSERT INTO local_market (local_market_id, company_name, adress_id, category_id) VALUES
  (1,'Bradesco Farmácia', 1, 2),
  (2,'Bradesco Moda', null, 1);



	 