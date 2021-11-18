-- migrate:up
CREATE TABLE `migrator` (
`name`  varchar(255) NULL
)
;

-- migrate:down
DROP TABLE `migrator`
