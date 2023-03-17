# factorytransporte_examenCod
 
EJERCICIO1:
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
1.- Patron Factory

En la tarea de Factory Transporte crea una rama nueva "barco".

Añade que la Factory pueda también tener objetos de tipo Barco.

Entrega el repositorio

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Para crear la rama barco en la tarea factorytransporte tengo que seguir los siguientes pasos:

- Creo un repositorio nuevo en github.

- Copio los comandos que me da github para conectar el repositorio y los introduzco en la terminal del Intelliji 
desde el proyecto.
  De estos comandos hablo: 
  echo "# factorytransporte_examenCod" >> README.md
  git init
  git add README.md
  git commit -m "first commit"
  git branch -M main
  git remote add origin https://github.com/lucasffffff/factorytransporte_examenCod.git
  git push -u origin main 

- Hago los siguientes comandos para subir el código actual al repositorio creado en github:
git add .
git commit -m "Commit inicial"  -> Nombre que le doy al commit.
git push origin main

- Voy a la parte inferior del ide donde sale el logo de ramas y pone main, entro y creo una nueva rama llamada Barco.

- Para situarme en la rama que acabo de crear y hacer cambios sobre ella, hago en la terminal el comando:
  git checkout Barco
  
- Una vez situado en la rama Barco, creo una clase Barco y añado el código pertinente a la clase main.

- Para actualizar estos nuevos cambios dentro de la rama Barco hago los comandos siguientes:
git add .
git commit -m "Rama y clase Barco hechas"
git push origin Barco

Con este último comando ya se ha subido a github toda la rama Barco con los cambios que hice en ella.
