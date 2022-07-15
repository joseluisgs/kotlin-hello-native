# Kotlin Hello Native 
Este es un ejemplo de como usar Kotlin en un proyecto Native, por ejemplo procesar un CSV

[![Kotlin](https://img.shields.io/badge/Code-Kotlin-blueviolet)](https://kotlinlang.org/)
[![Node.js](https://img.shields.io/badge/Platform-Native-green)](https://nodejs.org/es/)
[![LICENSE](https://img.shields.io/badge/Lisence-CC-%23e64545)](https://joseluisgs.github.io/docs/license/)
![GitHub](https://img.shields.io/github/last-commit/joseluisgs/kotlin-hello-native)

<p align="center">
  <a href="https://joseluisgs.github.io/" target="_blank"><img src="https://miro.medium.com/max/1400/1*iDQ77Lohz3F3tx2Fml1msg.png" 
  width='600px' borderRadius='1rem' boxShadow = '0 5px 18px rgba(0,0,0,0.3)'></a>
</p>

- [Kotlin Hello Native](#kotlin-hello-native)
  - [Acerca de](#acerca-de)
  - [Uso](#uso)
    - [Compilación y ejecución](#compilación-y-ejecución)
  - [Autor](#autor)
    - [Contacto](#contacto)
  - [Licencia de uso](#licencia-de-uso)

## Acerca de
Este proyecto muestra cómo hacer una sencilla app que lee un fichero CSV y muestra los datos, los procesa y saca su resultado en otro fichero.

El principal objetivo con este proyecto es: 
- Usar Kotlin como lenguaje para crear aplicaciones nativas, no JVM para cualquier plataforma: Linux, Windows, MacOS, Android, iOS, Raspberry Pi, etc gracias a LLVM y la propia librería de Kotlin nativa.
- Aplicar librerías de Kotlin Multiplataforma para dotar de funcionalidad.

<p align="center">
  <a href="https://joseluisgs.github.io/" target="_blank"><img src="https://miro.medium.com/max/640/1*tUyPsjM8mctWV9pIrbZKkw.png" 
  width='600px' borderRadius='1rem' boxShadow = '0 5px 18px rgba(0,0,0,0.3)'></a>
</p>

## Uso
Puedes llamar a la app usando el script de Gradle run o build
Compile Kotlin to JS using gradle

### Compilación y ejecución
```
Windows
$ gradlew.bat build

Linux / Mac
$ ./gradlew build

Run
$ ./gradlew ./gradlew runDebugExecutableNative
$ ./gradlew ./gradlew runReleaseExecutableNative       
```

La salida será una lista de paises
```csv 
1;España;ES;Castellano;Euro;Madrid;943916.754735567
2;Francia;FR;Francés;Euro;Paris;47967.12095737543
3;Italia;IT;Italiano;Euro;Roma;283212.9167356374
4;Alemania;DE;Alemán;Euro;Berlín;295540.03296615585
5;Reino Unido;UK;Inglés;Libra;Londres;722726.6691398313
6;Japón;JP;Japonés;Yen;Tokio;415913.0535591459
7;China;CN;Chino;Yuan;Pekín;379099.78469140484
8;Australia;AU;Inglés;Dólar;Canberra;549774.2109129715
9;Argentina;AR;Español;Peso;Buenos Aires;851569.9127902453
10;Brasil;BR;Portugués;Real;Brasilia;844776.9777917415
11;Estados Unidos;US;Inglés;Dólar;Washington;588933.4321287608
```

## Autor

Codificado con :sparkling_heart: por [José Luis González Sánchez](https://twitter.com/joseluisgonsan)

[![Twitter](https://img.shields.io/twitter/follow/joseluisgonsan?style=social)](https://twitter.com/joseluisgonsan)
[![GitHub](https://img.shields.io/github/followers/joseluisgs?style=social)](https://github.com/joseluisgs)

### Contacto
<p>
  Cualquier cosa que necesites házmelo saber por si puedo ayudarte 💬.
</p>
<p>
 <a href="https://joseluisgs.github.io/" target="_blank">
        <img src="https://joseluisgs.github.io/img/favicon.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://github.com/joseluisgs" target="_blank">
        <img src="https://distreau.com/github.svg" 
    height="30">
    </a> &nbsp;&nbsp;
        <a href="https://twitter.com/joseluisgonsan" target="_blank">
        <img src="https://i.imgur.com/U4Uiaef.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://www.linkedin.com/in/joseluisgonsan" target="_blank">
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/LinkedIn_logo_initials.png/768px-LinkedIn_logo_initials.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://discordapp.com/users/joseluisgs#3560" target="_blank">
        <img src="https://logodownload.org/wp-content/uploads/2017/11/discord-logo-4-1.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://g.dev/joseluisgs" target="_blank">
        <img loading="lazy" src="https://googlediscovery.com/wp-content/uploads/google-developers.png" 
    height="30">
    </a>    
</p>

## Licencia de uso

Este repositorio y todo su contenido está licenciado bajo licencia **Creative Commons**, si desea saber más, vea la [LICENSE](https://joseluisgs.github.io/docs/license/). Por favor si compartes, usas o modificas este proyecto cita a su autor, y usa las mismas condiciones para su uso docente, formativo o educativo y no comercial.

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Licencia de Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">JoseLuisGS</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://joseluisgs.github.io/" property="cc:attributionName" rel="cc:attributionURL">José Luis González Sánchez</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Reconocimiento-NoComercial-CompartirIgual 4.0 Internacional License</a>.<br />Creado a partir de la obra en <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/joseluisgs" rel="dct:source">https://github.com/joseluisgs</a>.