# Taller de Java  
## 🚀 Ejercicio #2: Registro de Notas con Map  

---

## 📌 Propósito  
Este programa en Java permite gestionar las notas de los estudiantes utilizando una estructura de datos `Map`. Almacena nombres y notas, muestra la lista completa, permite buscar la nota de un estudiante específico y encuentra la nota más alta junto al estudiante con mejor rendimiento.  

El proyecto utiliza conceptos básicos de programación en Java, como colecciones (`Map`), entrada/salida por consola y manipulación de datos.  

---

## 🚀 Instalación y Configuración  
### Requisitos Previos  
- Java Development Kit (JDK) 17 o superior  
- Git instalado en tu sistema  

### Clonar Repositorio  
```bash  
git clone https://github.com/Jhormancastella/Gestion-de-Estudiantes-con-List.git  
```  

### Compilar y Ejecutar  
1. Abre una terminal en la carpeta del proyecto.  
2. Compila el archivo Java:  
   ```bash  
   javac RegistroNotas.java  
   ```  
3. Ejecuta el programa:  
   ```bash  
   java RegistroNotas  
   ```  

---

## 🛠️ Uso  

1. **Registro de Estudiantes y Notas**:  
   - El programa solicitará al usuario cuántos estudiantes desea registrar.  
   - A continuación, pedirá los nombres y las notas de los estudiantes, almacenándolos en un `Map<String, Double>`.  

2. **Mostrar Lista Completa**:  
   - Una vez registrados, se mostrará la lista completa de estudiantes con sus notas.  

3. **Buscar Nota de un Estudiante**:  
   - El usuario podrá buscar la nota de un estudiante específico ingresando su nombre.  

4. **Encontrar la Nota Más Alta**:  
   - El programa encontrará y mostrará la nota más alta junto al nombre del estudiante con mejor rendimiento.  

### Ejemplo de Ejecución  
```bash  
¿Cuántos estudiantes desea registrar? 3  
Ingrese el nombre del estudiante #1: Ana  
Ingrese la nota de Ana: 15.5  
Ingrese el nombre del estudiante #2: jesus 
Ingrese la nota de Carlos: 18.0  
Ingrese el nombre del estudiante #3: lina
Ingrese la nota de Beatriz: 16.5  
--- Lista de Estudiantes y Notas ---  
Ana: 15.5  
jesus: 18.0  
lina: 16.5  
¿Desea buscar la nota de un estudiante? (si/no): si  
Ingrese el nombre del estudiante: jesus  
✅ La nota de 'jesus' es 18.0  
--- Mejor Rendimiento ---  
El estudiante con la nota más alta es: jesus (18.0)  
```  

---

## 📋 Características  
- Registro de estudiantes y notas utilizando `Map<String, Double>`.  
- Mostrar la lista completa de estudiantes con sus notas.  
- Buscar la nota de un estudiante específico utilizando el método `get()`.  
- Encontrar la nota más alta y el estudiante con mejor rendimiento utilizando `Collections.max()`.  

---

## 🚨 Estado del Ejercicio  
- Culminado.  

---

## 👤 Autor  
Jhorman Jesús Castellanos Morales  
```