# scandicraft_server

Serveur 1.8.8 https://papermc.io/

## Setup (require maven, !use git bash)
1. git clone -b ver/1.8.8 https://github.com/PaperMC/Paper.git
2. cd Paper/
3. git clone https://github.com/PaperMC/PaperclipMavenPlugin.git
4. cd PaperclipMavenPlugin
5. git checkout 9d475fb0297ec41966bfb982418d4c070a011f11
6. mvn clean install
7. cd ../
8. ./build.sh