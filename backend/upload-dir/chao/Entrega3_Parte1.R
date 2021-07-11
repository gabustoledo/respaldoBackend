# Ejercicio practico n. 3, Parte 1
# Inferencia y modelos estad�sticos
# Estudiantes: Gabriel Bustamante, Francisco Nunez
# Profesor: Jose Luis Jara
# Fecha de creacion: 26 de abril, 2021
# Ultima actualizacion: 1 de mayo, 2021

library ( ggplot2 )
library ( ggpubr )

clothes <- c(9.85, 9.94, 9.88, 9.93, 9.85, 9.95, 9.75, 9.75, 9.95, 9.77,
             9.83, 9.93, 9.67, 9.92, 9.92, 9.87, 9.74, 9.89, 9.67, 9.99 )

dataframe <- data.frame( clothes )

ggqqplot(
  data = dataframe,
  x = "clothes",
  color = "steelblue",
  xlab = "teorico",
  ylab=  "muestra",
  title = "Grafico Q-Q muestra v. dist. normal"
)

# Estimadores puntuales
mu_0 = 9.75
alfa <- 0.025

t.test(
  clothes,
  alternative = "greater",
  mu = mu_0,
  conf.level = 1 - alfa
)

# Tenemos las siguientes hipotesis:
# H0: mu = 9.75
# H1: mu > 9.75

# se rechaza H0 a favor de Ha ya que la media de permanencia de llamas en la ropa de dormir
# de ni�os es mayor a 9.75 con 97.5% de confianza. 

# media: 9.8525
# intervalo de confianza: [ 9.807357, Inf ]
# p-valor: 6.929e-05