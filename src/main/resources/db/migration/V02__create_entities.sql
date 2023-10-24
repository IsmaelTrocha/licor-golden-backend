CREATE TABLE STATUS(
    id bigserial PRIMARY KEY,
    name VARCHAR(255) NOT NULL
 );

CREATE TABLE PROPORTION(
    id bigserial PRIMARY KEY,
    quantity VARCHAR(255) NOT NULL
 );

CREATE TABLE COUNTRIES(
   id bigserial PRIMARY KEY,
   iso VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL
);

INSERT INTO COUNTRIES (id, name, iso)
VALUES (1, 'Colombia', 'CO');

CREATE TABLE CITIES(
 id bigserial PRIMARY KEY,
 name VARCHAR(255) NOT NULL,
 country_id bigserial,
 FOREIGN KEY (country_id) REFERENCES COUNTRIES(id)
);

INSERT INTO CITIES (id, name, country_id) VALUES (1, 'Cartagena', 1);

CREATE TABLE USERS(
  id bigserial PRIMARY KEY,
  first_name VARCHAR(255)  NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  age int NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
  create_at VARCHAR(255) NOT NULL,
  enable boolean NOT NULL,
  role varchar(15) NOT NULL
  );

CREATE TABLE ADDRESSES(
  id bigserial PRIMARY KEY,
  street VARCHAR(255) NOT NULL,
  avenue VARCHAR(255) NOT NULL,
  city_id bigserial,
  user_id bigserial,
  description TEXT NOT NULL,
  postal_code VARCHAR(255) NOT NULL,
  state VARCHAR(255) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES USERS(id),
  FOREIGN KEY (city_id) REFERENCES CITIES(id)
);

CREATE TABLE ORDERS(
  id bigserial PRIMARY KEY,
  user_id bigserial,
  address_id bigserial,
  product_id bigserial,
  quantity INT NOT NULL,
  total_price decimal(10,3) NOT NULL,
  creation_date TIMESTAMP,
  delivery_date TIMESTAMP,
  finish_date TIMESTAMP,
  status_id bigserial,
  FOREIGN KEY (user_id) REFERENCES USERS(id),
  FOREIGN KEY (address_id) REFERENCES ADDRESSES(id),
  FOREIGN KEY (status_id) REFERENCES STATUS(id),
  FOREIGN KEY (product_id) REFERENCES PRODUCTS(id)
  );

-- Para 330ml
INSERT INTO PROPORTION (quantity)
 VALUES ('330ml');

-- Para 375ml
INSERT INTO PROPORTION (quantity)
 VALUES ('375ml');

-- Para 750ml
INSERT INTO PROPORTION (quantity)
 VALUES ('750ml');

-- Para 1 Litro
INSERT INTO PROPORTION (quantity)
 VALUES ('1 Litro');



INSERT INTO CATEGORY (name, create_by, creation_date)
VALUES ('Vodka', 'Ismael.trocha@hotmail.com', NOW());

INSERT INTO CATEGORY (name, create_by, creation_date)
VALUES ('Whisky', 'Ismael.trocha@hotmail.com', NOW());

INSERT INTO CATEGORY (name, create_by, creation_date)
VALUES ('Ron', 'Ismael.trocha@hotmail.com', NOW());

INSERT INTO CATEGORY (name, create_by, creation_date)
VALUES ('Tequila', 'Ismael.trocha@hotmail.com', NOW());

INSERT INTO CATEGORY (name, create_by, creation_date)
VALUES ('Cerveza', 'Ismael.trocha@hotmail.com', NOW());

ALTER TABLE PRODUCTS DROP COLUMN category;

ALTER TABLE PRODUCTS ADD COLUMN update_date TIMESTAMP;
ALTER TABLE PRODUCTS ADD COLUMN hide_date TIMESTAMP;
ALTER TABLE PRODUCTS ADD COLUMN expiration_date TIMESTAMP;

ALTER TABLE PRODUCTS ADD COLUMN category_id bigserial;
ALTER TABLE PRODUCTS ADD CONSTRAINT fkproductcategory
 FOREIGN KEY (category_id) REFERENCES CATEGORY(id);

ALTER TABLE PRODUCTS ADD COLUMN status_id bigserial;
ALTER TABLE PRODUCTS ADD CONSTRAINT fkproductstatus
 FOREIGN KEY (status_id) REFERENCES STATUS(id);

ALTER TABLE PRODUCTS ADD COLUMN proportion_id bigserial;
ALTER TABLE PRODUCTS ADD CONSTRAINT fkproductproportion
 FOREIGN KEY (proportion_id) REFERENCES PROPORTION(id);