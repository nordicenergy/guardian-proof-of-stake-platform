----
# OPERATORS GUIDE #

----
## How to verify the Guardian Software package? ##
  Releases are signed by Jelurida using [GPG](https://en.wikipedia.org/wiki/GNU_Privacy_Guard). It is **highly** recommended to verify the signature every time you download new version. [There are some notes](https://bitcointalk.org/index.php?topic=5164586.0) how to do this. [This script](https://github.com/nxt-ext/-kit/blob/master/distrib/safe-nxt-download.sh) automates this process on Linux.

----
## How to configure Guardian? ##

  - config files under `conf/`
  - options are described in config files
  - **do not edit** `conf/nxt-default.properties` **nor** `conf/logging-default.properties`
  - use own config file instead: `conf/nxt.properties` or `conf/logging.properties`
  - only deviations from default config

----
## How to update Guardian? ##

  - **if configured as described above**, just unpack a new version over the existing installation directory
  - next run of Ardor will upgrade database if necessary
  
----
