# ZeroHunnit

πββοΈ μ°Έκ°μΈμ : λ°±μΉν μ€λ°±μ 

β³ μμκΈ°κ° : 2021.11.11 13:00 ~ νμ¬ μ μ μ€

π  μ¬μ© Tool

* JavaSE-1.8
* Eclipse jee 2021-06
* Git (μλ‘ μ²« νμ)
* Oracle 11.2.0.1.0

β μ£Όμ κΈ°λ₯

* μΆκ° μμ 

## ERD

![image-20211111213833988](https://user-images.githubusercontent.com/84169773/141306844-8d2dcdbf-7564-49f7-b2c0-531a0d66de16.png)

> ERD κ΄κ³λ μλλ€.
>
> λ€μμ Customer(κ³ κ°)λ Training(μ΄λμ’λͺ©)μ μ¬λ¬κ° κ°μ§ μ μκ³ , Training λν μ¬λ¬ Customerμ μ΄λκΈ°λ‘μ κ°μ§ μ μλ M:Nμ κ΄κ³λ₯Ό κ°μ§λλ€.
>
> νμ΄λΈ κ°μ κ΄κ³λ Do Train(μ΄λκΈ°λ‘)μ ν΅ν΄ Info νμ΄λΈμ λ΄κΈ°κ² λ©λλ€. μλλ νμ΄λΈμ μμΈ λͺμΈμλλ€.

## νμ΄λΈ λͺμΈ

![image-20211111214648279](https://user-images.githubusercontent.com/84169773/141306903-d3d1acf4-9b17-4ad3-a91e-07a803e302fd.png)



- Customer TABLE

  CREATE TABLE customer(
  	id varchar2(10),
  	name varchar2(10) PRIMARY KEY,
  	height number, weight number
  );

- Training TABLE

  CREATE TABLE training(
  	t_name varchar2(10) PRIMARY KEY
  );

  - μ΄λ λͺ©λ‘ μΆκ° 

  INSERT INTO training VALUES('κ°μ΄μΌλ');

  INSERT INTO training VALUES('λ±μ΄λ');

  INSERT INTO training VALUES('νμ²΄μ΄κΉ¨');

  **μ μ κΉ, μ μ§μ  insert νμκΉμ β**
  
  ![Sorry](https://user-images.githubusercontent.com/84169773/141306925-bc7511d4-56f6-4c4c-a1df-fcfc6e16c541.jpg)


  > μ¬μ€ λ°λ‘ κ΅¬νν  μλ μλλ° 3κ°λ°μ μλκΈ°λ νκ³ ,,,,γ μ£μ‘ν©λλ€

- νμ κΈ°λ‘ TABLE

  CREATE TABLE info(
  	c_name varchar2(10),
  	t_name varchar2(10),
  	tdate date default sysdate,
  	liftweight number,
  	FOREIGN KEY(c_name) REFERENCES customer(name) ON DELETE CASCADE,
  	FOREIGN KEY(t_name) REFERENCES training(t_name) ON DELETE SET NULL
  );

> Nameμ Primary Keyλ‘ λ°λ Customer νμ΄λΈκ³Ό t_nameμ Primary Keyλ‘ λ°λ Training νμ΄λΈμ λ€λλ€ κ΄κ³λ Infoμμ c_name, t_nameμ΄λΌλ Foreign Keyλ‘ λ§λ Info νμ΄λΈμμ μ΄λκΈ°λ‘μ μ μ₯νκ² λ©λλ€.

