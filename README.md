# Belajar Java EE 6

Menggunakan java EE 6, deploy into websphere

## Install `oracle/database:11.2.0.2-xe`

How to install oracle database image [available here](https://github.com/oracle/docker-images/tree/master/OracleDatabase)

## Deloyed war application

```bash
mvn clean package -Dmaven.skip.test=true
```

## Run docker-compose

```bash
docker-compose up
```

## Grant User `HR@XE`

```bash
docker exec <container-id-oracledb> bash /unlock-hr.sh
```

## Cleanup Docker container

```bash
docker-compose down
```