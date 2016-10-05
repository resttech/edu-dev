If you find below error:
org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar [ insert into RAW_REPORT(DATE,IMPRESSIONS,CLICKS,EARNING) values (?, ?, ?, ?) ];

Then run below db script:
use test_batch;


DROP TABLE IF EXISTS RAW_REPORT;



create table RAW_REPORT(
DATE VARCHAR(100) NOT NULL,
IMPRESSIONS VARCHAR(100) NOT NULL,
CLICKS VARCHAR(40) NOT NULL,
EARNING VARCHAR(40) NOT NULL
);




