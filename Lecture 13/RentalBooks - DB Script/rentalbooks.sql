CREATE TABLE student(
	id INTEGER(10) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL
	);
	
CREATE TABLE exemplar(
    id INTEGER(10) NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    pages INTEGER(10) NOT NULL
	);
					
CREATE TABLE book(
    isbn CHAR(13) NOT NULL,
    edition INTEGER(10) NOT NULL,
    exemplarId INTEGER(10),
    FOREIGN KEY (exemplarId) REFERENCES exemplar (id) ON DELETE CASCADE
	);
	
CREATE TABLE magazine(
    issn CHAR(8) NOT NULL,
    exemplarId INTEGER(10),
    FOREIGN KEY (exemplarId) REFERENCES exemplar (id) ON DELETE CASCADE
	);
	
CREATE TABLE rental(
    dateWithdraw VARCHAR(10) NOT NULL,
    dateReturn VARCHAR(10) NOT NULL,
    studentId INTEGER(10),
    exemplarId INTEGER(10),
    FOREIGN KEY (studentId) REFERENCES student (id) ON DELETE CASCADE,
    FOREIGN KEY (exemplarId) REFERENCES exemplar (id) ON DELETE CASCADE,
    PRIMARY KEY (dateWithdraw, studentId, exemplarId)
	);