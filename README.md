# DruidCrack
Druid 密文解密工具

### 加密
```
# 1
java -cp druid-1.2.3.jar com.alibaba.druid.filter.config.ConfigTools 123456

privateKey:MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAgsCalPBO60c2/sISKnO5PCfvFb5mu540Bxyhi7FhGaiPonaG8mBKribj0DEKGY4tR3rhoEx3AfJ89vZ0pI/yGwIDAQABAkBE8DwQrytNDb1HURe23lEaEIwUUNFltqID5eqe9qUVm201yEDbJHcQAh70fiazH+TmXXzprPG7tMBjNSlMxJhhAiEA6t5GZGMXjKWEfjJzpqN8eNBDmLE4+W6UUAb96+QzhHMCIQCOhDmv/wMkvo2wngNcuYN1NVXBOkaC3FM5jBrgi4IZuQIhAIXoJrATgxiwQcMFlsR6T3w+GVwUJsynjC24XstAN1MbAiAWwdR4Xw9AcdEsT78XsmPkdnTQGx8hTE9Z1B6ClqRauQIhAJh84Ap3KXNVQytbzbuKcR1Tjkb5G2yh8vATfqtBW6Pg

publicKey:MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAILAmpTwTutHNv7CEipzuTwn7xW+ZrueNAccoYuxYRmoj6J2hvJgSq4m49AxChmOLUd64aBMdwHyfPb2dKSP8hsCAwEAAQ==

password:ahlY3VxgS7p4mTOuKDttIJs/3RpprDsPElTpZA/Js06TZX5BYP/VR+aiW5OsCaVkxuh/5UnE9962xBoWZgRE0A==


# 2
java -cp druid-1.0.26.jar com.alibaba.druid.filter.config.ConfigTools 123456

privateKey:MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAxLqxhO6NvGHKS8Uhr/OriCo3f6XDQFNe9IMvKaTwOUjJkt/ed0AXdAl1AwziRrfRg+GA+V1ZmslzN/ew42Fc3QIDAQABAkBlisOEDKml2YfUMi0gJ5KbFsdMoJ+2PRIe/PND+Hlx5wK5jRvmfrbCE/C7WK4kZwot/QTouFbysLrybjIuDFrVAiEA8QmqFTrA0Nmham4trn5D969S6HBMBEk1XiqMhXhETAsCIQDQ8OwQRZTjSnnw3wL8vayoqzwTdo4AiuhqD8dbfOyjtwIgTx1z9SnmteZpA+0ME3UgTAEA/og1e0aoPLNMklaKXEcCIQCicFumvuHk3zb0W/0Pj0rXiuDW5Nm7dEMCiifcab/z+wIgMsXxKJhqNHXRs9iZdfG1ztvUK5xLUBtTeQerRHoZWlg=

publicKey:MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAMS6sYTujbxhykvFIa/zq4gqN3+lw0BTXvSDLymk8DlIyZLf3ndAF3QJdQMM4ka30YPhgPldWZrJczf3sONhXN0CAwEAAQ==

password:L11FVrI49AvQ7v3HgWg+nF1iI4vWK3HsT7Q9B/LOpHl8p+nBT8uTIxc+qKDefTgeYDXfTCdXxgNcrcdeRAbN3A==


# 3
java -cp druid-1.0.26.jar com.alibaba.druid.filter.config.ConfigTools 123456

privateKey:MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEArTo+nPwKeMcs998Il7nWUuBO8+z7Ut4XbxYutM2Ejqn2MoaBUC83LI7/GgkVSwHQbMWBl/EpIMtA/XazwJj65QIDAQABAkEAh81rnMJyqzDqbgApyljkTuCOxOf6N4LpOCtZvmCIFRaYJja8VUbxysPIq0UGjnTKNjSFDPrWUoevTOsrGGhC2QIhAPF4dQK/NA5OOKJ0K/Zwc3aMbxx1R6myHMxAlJZAx1xfAiEAt6aXdLhyjyeD20hKZDmjhi1lW1T82fsQOhlCgATW7zsCIQDMyakK7FfcrhAwDrBeL95sswtkqj5dt9XekAK0LzokpwIgJJMs/rXtOs1n2TggeK1x/7rywKnAYbk6lheJwu0z0RkCIHAbsXTE8l6n9hmkq4k9Kq44vU3Y4pMTBHN/kOi7KCdq

publicKey:MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAK06Ppz8CnjHLPffCJe51lLgTvPs+1LeF28WLrTNhI6p9jKGgVAvNyyO/xoJFUsB0GzFgZfxKSDLQP12s8CY+uUCAwEAAQ==

password:bxCGRmXo3kBjSJGl814PEFqNPsM6hmoaZqw7qPrQxlJh45qRJ3b26yq9hyii2Mui5+NJjwEM6E2IBfBoRbFgTQ==
```

### 解密
```
java -jar druidcrack-1.0-SNAPSHOT.jar
 ____          _   _ _____             _
|    \ ___ _ _|_|_| |     |___ ___ ___| |_
|  |  |  _| | | | . |   --|  _| .'|  _| '_|
|____/|_| |___|_|___|_____|_| |__,|___|_,_|
                A Tiny Tools To DruidCrack | By RabbitMask
请输入您的密文：bxCGRmXo3kBjSJGl814PEFqNPsM6hmoaZqw7qPrQxlJh45qRJ3b26yq9hyii2Mui5+NJjwEM6E2IBfBoRbFgTQ==
请输入您的公钥：MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAK06Ppz8CnjHLPffCJe51lLgTvPs+1LeF28WLrTNhI6p9jKGgVAvNyyO/xoJFUsB0GzFgZfxKSDLQP12s8CY+uUCAwEAAQ==
您的密码明文为：123456
```
