# Comandos de Angular

1. **ng new**: Crea un nuevo proyecto Angular con la estructura básica y las dependencias iniciales.
   - Ejemplo: `ng new my-angular-app`

2. **ng serve**: Inicia un servidor de desarrollo y observa los cambios en los archivos para recargar automáticamente la aplicación en el navegador.
   - Ejemplo: `ng serve`

3. **ng generate (o ng g)**: Crea nuevos elementos en la aplicación, como componentes, servicios, módulos, etc.
   - Ejemplo: `ng generate component my-component`

4. **ng build**: Compila la aplicación para producción. Genera una carpeta "dist" con los archivos optimizados listos para ser desplegados.
   - Ejemplo: `ng build`

5. **ng test**: Ejecuta pruebas unitarias utilizando Karma.
   - Ejemplo: `ng test`

6. **ng e2e (end-to-end)**: Realiza pruebas end-to-end utilizando Protractor.
   - Ejemplo: `ng e2e`

7. **ng lint**: Analiza el código en busca de problemas de estilo y prácticas recomendadas.
   - Ejemplo: `ng lint`

8. **ng add**: Agrega características y configuraciones a tu proyecto, como bibliotecas externas, conjuntos de herramientas y más.
   - Ejemplo: `ng add @angular/material`

9. **ng update**: Actualiza las dependencias del proyecto a las versiones más recientes y compatibles.
   - Ejemplo: `ng update @angular/core`

10. **ng config**: Permite configurar opciones a nivel de proyecto.
    - Ejemplo: `ng config defaultProject my-project`

11. **ng doc (o ng generate application)**: Genera documentación para tu aplicación.
    - Ejemplo: `ng doc`

12. **ng xi18n**: Extrae las cadenas de texto marcadas para internacionalización (i18n) y genera archivos de traducción.
    - Ejemplo: `ng xi18n`

13. **ng deploy**: Despliega la aplicación a un servicio de alojamiento (por ejemplo, GitHub Pages o Firebase Hosting).
    - Ejemplo: `ng deploy`

14. **ng config**: Configura opciones a nivel global o por usuario para Angular CLI.
    - Ejemplo: `ng config`

15. **ng help**: Muestra la ayuda para un comando específico o general de Angular CLI.
    - Ejemplo: `ng help`

16. **ng outdated**: Muestra las dependencias que están desactualizadas en tu proyecto.
    - Ejemplo: `ng outdated`

17. **ng lint --fix**: Intenta corregir automáticamente problemas de estilo que puedan ser resueltos.
    - Ejemplo: `ng lint --fix`

18. **ng serve --open (o simplemente ng s -o)**: Abre automáticamente la aplicación en el navegador después de iniciar el servidor de desarrollo.
    - Ejemplo: `ng serve --open`

19. **ng build --prod**: Compila la aplicación para producción con optimizaciones adicionales.
    - Ejemplo: `ng build --prod`

20. **ng test --code-coverage**: Ejecuta pruebas unitarias y genera un informe de cobertura de código.
    - Ejemplo: `ng test --code-coverage`

21. **ng serve --proxy-config**: Permite configurar un proxy para redirigir solicitudes durante el desarrollo, útil para evitar problemas de CORS.
    - Ejemplo: `ng serve --proxy-config proxy.conf.json`

22. **ng build --stats-json**: Genera un archivo JSON con estadísticas de construcción, útil para análisis detallado.
    - Ejemplo: `ng build --stats-json`

23. **ng eject**: Deshace la abstracción de configuración de Angular CLI, exponiendo herramientas de configuración avanzadas.
    - Ejemplo: `ng eject`

24. **ng ngcc**: Ejecuta el Angular Compatibility Compiler, que ayuda a garantizar que las bibliotecas de terceros estén compatibles con Ivy.
    - Ejemplo: `ng ngcc`

25. **ng version**: Muestra la versión de Angular CLI y las dependencias del proyecto.
    - Ejemplo: `ng version`

26. **ng xi18n --format=xlf**: Genera archivos de traducción en formato XLIFF, que es comúnmente utilizado en proyectos de internacionalización.
    - Ejemplo: `ng xi18n --format=xlf`

27. **ng build --aot**: Compila la aplicación utilizando la compilación Ahead-of-Time (AOT), lo que puede mejorar el rendimiento en tiempo de ejecución.
    - Ejemplo: `ng build --aot`

28. **ng update --all**: Actualiza todas las dependencias del proyecto a las versiones más recientes y compatibles.
    - Ejemplo: `ng update --all`

29. **ng lint --format=stylish**: Especifica el formato de salida al ejecutar el linter, en este caso, en un formato elegante y fácil de leer.
    - Ejemplo: `ng lint --format=stylish`

30. **ng serve --watch**: Observa los cambios en los archivos y vuelve a compilar automáticamente cuando se detectan modificaciones.
    - Ejemplo: `ng serve --watch`

31. **ng test --watch**: Ejecuta pruebas en modo de observación, volviendo a ejecutarse automáticamente cuando se realizan cambios en el código fuente.
    - Ejemplo: `ng test --watch`

32. **ng lint --fix && ng test --code-coverage && ng build --prod**: Ejecuta una serie de comandos combinados para corrección automática, pruebas con cobertura de código y compilación para producción.
    - Ejemplo: `ng lint --fix && ng test --code-coverage && ng build --prod`

33. **ng generate module feature-module --routing**: Genera un módulo con enrutamiento, facilitando la organización de funcionalidades específicas.
    - Ejemplo: `ng generate module feature-module --routing`

34. **ng config cli.defaultCollection**: Permite cambiar la colección de schematics predeterminada para la generación de código.
    - Ejemplo: `ng config cli.defaultCollection @ngrx/schematics`

35. **ng generate directive (o ng g d)**: Crea una nueva directiva Angular. Las directivas son utilizadas para modificar el comportamiento de los elementos DOM.
    - Ejemplo: `ng generate directive my-directive`

36. **ng generate service (o ng g s)**: Crea un nuevo servicio Angular. Los servicios son utilizados para encapsular lógica de negocio o funcionalidad compartida.
    - Ejemplo: `ng generate service my-service`

37. **ng generate pipe (o ng g p)**: Crea una nueva tubería (pipe) Angular. Las tuberías transforman la presentación de datos en las plantillas.
    - Ejemplo: `ng generate pipe my-pipe`

38. **ng generate class (o ng g cl)**: Crea una nueva clase Angular. Puedes usar esto para definir modelos u otras clases utilizadas en tu aplicación.
    - Ejemplo: `ng generate class my-class`

39. **ng generate guard (o ng g g)**: Crea una nueva guarda (guard) Angular. Las guardas son utilizadas para controlar la navegación en la aplicación.
    - Ejemplo: `ng generate guard my-guard`

40. **ng generate enum (o ng g e)**: Crea una nueva enumeración Angular. Útil para definir conjuntos de constantes con nombre.
    - Ejemplo: `ng generate enum my-enum`

41. **ng generate interface (o ng g i)**: Crea una nueva interfaz Angular. Las interfaces son utilizadas para definir contratos para las estructuras de datos.
    - Ejemplo: `ng generate interface my-interface`

42. **ng generate module (o ng g m)**: Crea un nuevo módulo Angular. Los módulos ayudan a organizar y modularizar la aplicación.
    - Ejemplo: `ng generate module my-module`

43. **ng generate component my-component --module=app.module**: Crea un componente y lo registra automáticamente en el módulo especificado.
    - Ejemplo: `ng generate component my-component --module=app.module`

44. **ng generate library (o ng g lib)**: Crea una nueva biblioteca Angular. Útil para compartir código entre proyectos.
    - Ejemplo: `ng generate library my-library`

45. **ng generate application (o ng g app)**: Crea una nueva aplicación Angular dentro de un proyecto monorepo.
    - Ejemplo: `ng generate application my-app`

46. **ng generate application my-app --style=scss**: Crea una nueva aplicación Angular con el preprocesador SCSS para los estilos.
    - Ejemplo: `ng generate application my-app --style=scss`

47. **ng build --prod --stats-json**: Compila la aplicación para producción y genera estadísticas en formato JSON.
    - Ejemplo: `ng build --prod --stats-json`

48. **ng update @angular/core**: Actualiza el núcleo de Angular a la última versión compatible.
    - Ejemplo: `ng update @angular/core`

49. **ng new my-workspace --create-application=false**: Crea un nuevo espacio de trabajo Angular sin generar una aplicación inicial.
    - Ejemplo: `ng new my-workspace --create-application=false`
