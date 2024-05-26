Mga need gawin para sa sa database since local ito need ito i input mano mano sa mysql using xampp 

kailangan updated din ito bawat gawa ng database kasi dito tayo mag kukuha ng mga ininsert ninyo

1st step: mag download ng xampp, run xampp start apache and mysql
2nd step: download this mysql/j https://dev.mysql.com/downloads/connector/j/
	- may option na pagpipilian piliin ang platform indepent then pag kapunta sa next page click lang no thanks just start my download kasi pag s signupin kayo
	- after ma download extract it using winrar then open ang netbeans 
	- sa project natin hanapin ang libaries right click then add JAR folder
	- located kung saan mo dinowload yung jar nayon then click and open
	- after niyan setup na ng database and mga tables
3rd step: open xampp then click yung admin katabi ng start
	- mapupunta yan sa google chrome phpMyAdmin 
 	- pag open niyo ng site meron yan databases tas database name. lagay niyo librarydb then hit create
	- then lalabas na sa left panel ang db natin click lang yan tas punta ka tab ng SQL then dito tayo mag t type ng command for tables
4th step: copy and paste lang ang mga to per -------- NOTE: UPDATE ACCORDINGLY 

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL  -- Store hashed passwords for security
);

INSERT INTO Users (username, password) VALUES
('admin', 'adminpass'),
('librarian', 'libpass');

-----------------------------------------------------------

CREATE TABLE Books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(13) NOT NULL,
    category VARCHAR(50) NOT NULL,
    author VARCHAR(255) NOT NULL,
    copyright VARCHAR(4) NOT NULL,
    publisher VARCHAR(255) NOT NULL,
    status VARCHAR(50) NOT NULL
);

----------------------------------------------------------------------
-- Inserting default books into the 'Books' table

INSERT INTO Books (title, isbn, category, author, copyright, publisher, status) VALUES 
('The Great Gatsby', '9780743273565', 'Fiction', 'F. Scott Fitzgerald', '1925', 'Charles Scribner\'s Sons', 'Available'), 
('To Kill a Mockingbird', '9780060935467', 'Fiction', 'Harper Lee', '1960', 'J.B. Lippincott & Co.', 'Available'), 
('1984', '9780451524935', 'Fiction', 'George Orwell', '1949', 'Secker & Warburg', 'Available'), 
('Pride and Prejudice', '9781503290563', 'Fiction', 'Jane Austen', '1813', 'T. Egerton', 'Available'), 
('The Catcher in the Rye', '9780316769488', 'Fiction', 'J.D. Salinger', '1951', 'Little, Brown and Company', 'Available');

INSERT INTO Books (title, isbn, category, author, copyright, publisher, status) VALUES 
('Sapiens: A Brief History of Humankind', '9780062316097', 'Non-Fiction', 'Yuval Noah Harari', '2011', 'Harper', 'Available'), 
('Educated', '9780399590504', 'Non-Fiction', 'Tara Westover', '2018', 'Random House', 'Available'), 
('The Immortal Life of Henrietta Lacks', '9781400052189', 'Non-Fiction', 'Rebecca Skloot', '2010', 'Crown Publishing Group', 'Available'), 
('The Wright Brothers', '9781476728759', 'Non-Fiction', 'David McCullough', '2015', 'Simon & Schuster', 'Available'), 
('Unbroken', '9780812974492', 'Non-Fiction', 'Laura Hillenbrand', '2010', 'Random House', 'Available');

INSERT INTO Books (title, isbn, category, author, copyright, publisher, status) VALUES 
('Introduction to Algorithms', '9780262033848', 'Academic', 'Thomas H. Cormen', '2009', 'MIT Press', 'Available'), 
('Artificial Intelligence: A Modern Approach', '9780136042594', 'Academic', 'Stuart Russell', '2010', 'Pearson', 'Available'), 
('The Art of Computer Programming', '9780201896831', 'Academic', 'Donald E. Knuth', '1997', 'Addison-Wesley', 'Available'), 
('Calculus: Early Transcendentals', '9780495011668', 'Academic', 'James Stewart', '2007', 'Cengage Learning', 'Available'), 
('Physics for Scientists and Engineers', '9781337553292', 'Academic', 'Raymond A. Serway', '2018', 'Cengage Learning', 'Available');


-------------------------------------------------------------
CREATE TABLE student_borrowing (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id VARCHAR(50),
    student_name VARCHAR(255),
    year VARCHAR(10),
    section VARCHAR(10),
    contact_no VARCHAR(50),
    book_id INT,
    book_title VARCHAR(255),
    book_isbn VARCHAR(50),
    book_category VARCHAR(50),
    date_borrowed DATE,
    due_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(id)
);

for student list table organized: 

CREATE TABLE student_list (
    student_id VARCHAR(50) PRIMARY KEY,
    student_name VARCHAR(100),
    year VARCHAR(20),
    section VARCHAR(50),
    contact_no VARCHAR(50),
    book_borrowed_qty INT
);


