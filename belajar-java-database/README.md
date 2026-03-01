# Belajar Java Database (JDBC)

Proyek ini berisi latihan koneksi Java ke database MySQL menggunakan Docker.

## Database Schema

Gunakan query di bawah ini untuk membuat tabel `customers` di database `belajar_java_database`:

```sql
CREATE TABLE customers
(
    id          VARCHAR(100) NOT NULL,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL,
    CONSTRAINT email_unique UNIQUE (email),
    PRIMARY KEY (id)
) ENGINE = InnoDB;

INSERT INTO customers (id, name, email) VALUES
('C001', 'Bachtiar F', 'bachtiar.f@example.com'),
('C002', 'Budi Santoso', 'budi.s@example.com'),
('C003', 'Siti Aminah', 'siti.a@example.com'),
('C004', 'Andi Wijaya', 'andi.w@example.com'),
('C005', 'Dewi Lestari', 'dewi.l@example.com'),
('C006', 'Rian Hidayat', 'rian.h@example.com'),
('C007', 'Eka Saputra', 'eka.s@example.com'),
('C008', 'Maya Indah', 'maya.i@example.com'),
('C009', 'Fajar Ramadhan', 'fajar.r@example.com'),
('C010', 'Gita Permata', 'gita.p@example.com');

CREATE TABLE admin
(
    username    VARCHAR(100) NOT NULL,
    PASSWORD    VARCHAR(100) NOT NULL,
    PRIMARY KEY (username)
) ENGINE = INNODB;

INSERT INTO admin (username, PASSWORD) VALUES ("admin","admin");

CREATE TABLE comments
(
    id  INT NOT NULL AUTO_INCREMENT,
    email    VARCHAR(100),
    COMMENT TEXT,
    PRIMARY KEY (id)
) ENGINE = INNODB;

CREATE TABLE sample_time
(
    id  INT NOT NULL AUTO_INCREMENT,
    sample_date    DATE,
    sample_time TIME,
    sample_timestamp TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE = INNODB;