CREATE TABLE JOB_TITLE(
   id bigserial PRIMARY KEY,
   name varchar(255)
);

CREATE TABLE NOTES(
  id bigserial PRIMARY KEY,
  description TEXT
);

CREATE TABLE CONTACT (
    id bigserial PRIMARY KEY,
    name VARCHAR(100),
    last_name VARCHAR(100),
    phone_number VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE SUPPLIER (
    id bigserial PRIMARY KEY,
    company_name VARCHAR(100),
    contact_id bigserial,
    address VARCHAR(255),
    state VARCHAR(50),
    postal_code VARCHAR(20),
    country_id bigserial,
    principal_phone VARCHAR(20),
    second_phone VARCHAR(20),
    principal_email VARCHAR(100),
    sec_email VARCHAR(100),
    web_site VARCHAR(255),
    create_date TIMESTAMP,
    created_by VARCHAR (255),
    updated_by VARCHAR (255),
    note_id bigserial,
    FOREIGN KEY (country_id) REFERENCES COUNTRIES(id),
    FOREIGN KEY (contact_id) REFERENCES CONTACT(id),
    FOREIGN KEY (note_id) REFERENCES NOTES(id)
);

CREATE TABLE LIQUOR_IMPORTATION (
    id bigserial PRIMARY KEY,
    supplier_id bigserial,
    importation_date TIMESTAMP,
    country_origen bigserial,
    quantity INT,
    liquor_type VARCHAR(50),
    status_id bigserial,
    FOREIGN KEY (status_id) REFERENCES STATUS(id),
    FOREIGN KEY (country_origen) REFERENCES COUNTRIES(id),
    FOREIGN KEY (supplier_id) REFERENCES SUPPLIER(id)
);


CREATE TABLE SHOPPING_CART(
  id bigserial PRIMARY KEY,


);


INSERT INTO STATUS (name) VALUES ('Pendiente');
INSERT INTO STATUS (name) VALUES ('En progreso');
INSERT INTO STATUS (name) VALUES ('Completo');
INSERT INTO STATUS (name) VALUES ('En espera');
INSERT INTO STATUS (name) VALUES ('Cancelado');
INSERT INTO STATUS (name) VALUES ('En revisión');
INSERT INTO STATUS (name) VALUES ('Abierto');
INSERT INTO STATUS (name) VALUES ('Cerrado');
INSERT INTO STATUS (name) VALUES ('Nuevo');
INSERT INTO STATUS (name) VALUES ('Resuelto');
