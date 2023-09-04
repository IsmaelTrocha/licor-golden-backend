CREATE TABLE STATUS(
    id bigserial PRIMARY KEY,
    name VARCHAR(255) NOT NULL
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

CREATE TABLE ADDRESSES(
  id bigserial PRIMARY KEY,
  street VARCHAR(255) NOT NULL,
  avenue VARCHAR(255) NOT NULL,
  city_id bigserial,
  user_id bigserial,
  description TEXT NOT NULL,
  postal_code VARCHAR(255) NOT NULL,
  state VARCHAR(255) NOT NULL,
  FOREIGN KEY (city_id) REFERENCES CITIES(id),
  FOREIGN KEY (user_id) REFERENCES USERS(id)
);

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