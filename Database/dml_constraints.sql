
--owners table--
CREATE TABLE owners(
	owner_id serial PRIMARY KEY, -- the PRIMARY KEY uniquely identifies EACH record IN a TABLE . It's typically an ID.
	--serial is an auto-incrementing data type. we don't need to give it a value when we insert data. Its' automatic 
	--whenever we insert a new owner, the owner_id will be generated for us
	owner_name TEXT NOT NULL -- since this has a NOT NULL CONSTRAINTS, we have TO provide VALUES FOR name
	
);

--pets table--
CREATE TABLE pets(
	pet_id serial PRIMARY KEY,
	species TEXT,
	age int CHECK (age > 1), 
	
	owner_id_fk int REFERENCES owners (owner_id) -- this IS a FOREIGN KEY.(note: the use of "reference")
	--this is saying, this foreign key is bound to the priamry key (owner_id) of the owners table
	--THIS IS HOW WE ESTABLISH RELATIONSHIPS BETWEEN OUR TABLES OF DATA

);