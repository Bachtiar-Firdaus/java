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