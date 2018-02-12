#!/bin/bash
# docker exec jaxrsjpaoracleexample_oracledb_1 sh /unlock-hr.sh
su -p oracle -c "sqlplus / as sysdba << EOF
      ALTER USER SYS IDENTIFIED BY admin;
      ALTER USER SYSTEM IDENTIFIED BY admin;
      ALTER USER HR IDENTIFIED BY hr ACCOUNT UNLOCK;
      exit;
EOF"; 
