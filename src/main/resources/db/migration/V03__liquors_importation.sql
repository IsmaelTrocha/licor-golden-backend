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

CREATE TABLE Cart (
    id bigserial PRIMARY KEY,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES USERS(id)
);

CREATE TABLE CartItem (
    id bigserial PRIMARY KEY,
    product_id bigserial,
    cart_id bigserial,
    quantity INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES PRODUCTS(id),
    FOREIGN KEY (cart_id) REFERENCES CART(id)
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

INSERT INTO public.products
(id, name_product, description, image_url, stock, creation_date, price, update_date, hide_date, expiration_date, category_id, status_id, proportion_id)
VALUES(1, 'Aguila Light', 'Bien fría', 'asdasd', 100, '2023-10-26 14:11:50.217', 5000.000, NULL, NULL, NULL, 1, 1, 1);
INSERT INTO public.products
(id, name_product, description, image_url, stock, creation_date, price, update_date, hide_date, expiration_date, category_id, status_id, proportion_id)
VALUES(2, 'Blue Label', 'De calidad', 'asdasd', 100, '2023-10-26 14:11:50.217', 5000.000, NULL, NULL, NULL, 1, 1, 1);
INSERT INTO public.products
(id, name_product, description, image_url, stock, creation_date, price, update_date, hide_date, expiration_date, category_id, status_id, proportion_id)
VALUES(3, 'Vino', '100 años', 'asdasd', 100, '2023-10-26 14:11:50.217', 5000.000, NULL, NULL, NULL, 1, 1, 1);

INSERT INTO public.users
(id, first_name, last_name, email, "password", age, phone_number, create_at, "enable", "role")
VALUES(1, 'Ismael', 'Trocha', 'ismaeltrocha@gmail.com', '020', 20, '3008571063', '2023-10-27 16:10:22.170', true, 'ADMIN');