DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS BRAND;
DROP TABLE IF EXISTS COLOR;
DROP TABLE IF EXISTS PRODUCT_CATEGORY;
  
CREATE TABLE BRAND (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL
);

  
CREATE TABLE COLOR (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL,
  CODE VARCHAR(5) NOT NULL
);

  
CREATE TABLE PRODUCT_CATEGORY (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL
);

  
CREATE TABLE PRODUCT(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL,
  QUANTITY INT NOT NULL,
  SIZE VARCHAR(5) NOT NULL,
  PRICE INT NOT NULL,
  BRND_ID INT NOT NULL,
  foreign key (BRND_ID) references BRAND(ID),
  CLR_ID INT NOT NULL,
  foreign key (CLR_ID) references COLOR(ID),
  PRDCT_CTGR_ID INT NOT NULL,
  foreign key (PRDCT_CTGR_ID) references PRODUCT_CATEGORY(ID)
);