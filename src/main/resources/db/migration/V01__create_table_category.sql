CREATE TABLE CATEGORY(
    id bigserial PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    create_by VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP
);

CREATE TABLE PRODUCTS(
    id bigserial PRIMARY KEY,
    name_product VARCHAR(255) NOT NULL,
    description TEXT,
    image_url VARCHAR(255),
    stock int,
    category varchar (255) NOT NULL,
    creation_date TIMESTAMP,
    price DECIMAL(10,3) NOT NULL
);

CREATE TABLE IMAGES(
  id bigserial PRIMARY KEY,
  name VARCHAR (255) NOT NULL,
  resource VARCHAR(255) NOT NULL
);

