# Ejercicio practico n. 3, Parte 2
# Inferencia y modelos estad�sticos
# Estudiantes: Gabriel Bustamante, Francisco Nunez
# Profesor: Jose Luis Jara
# Fecha de creacion: 29 de abril, 2021
# Ultima actualizacion: 1 de mayo, 2021

library ( ggplot2 )
library ( ggpubr )
library ( dplyr )

instance <- chickwts;


t_A <- filter(instance, feed == "linseed" )
t_B <- filter(instance, feed == "horsebean")

df_t_A <- droplevels(t_A)
df_t_B <- droplevels(t_B)

ggqqplot(
  data = df_t_A,
  x = "weight",
  color = "darkgreen",
  xlab = "weight",
  ylab = "sample",
  title = "Q-Q plot linseed "
)

ggqqplot(
  data = df_t_B,
  x = "weight",
  color = "red",
  xlab = "weight",
  ylab = "sample",
  title = "Q-Q plot horsebean "
)

mu_0 <- 0
alfa <- 0.01

result <- t.test(
  x = df_t_A$weight,
  y = df_t_B$weight,
  paired = FALSE,
  mu = mu_0,
  conf.level = 1 - alfa
)

result

mean_A <- result$estimate[1]
mean_B <- result$estimate[2]

mean_A - mean_B

# Tenemos las siguientes hipotesis:
# H0: muA = muB
# H1: muA > muB

# Con un p muy bajo se rechaza la hip�tesis nula a favor de la alternativa. 
# Como las muestras son reducidas ( n < 30 ), se utiliz� un 99% de confianza.

# diferencia de medias (A - B): 58.55
# intervalo de confianza: [ 3.267538, 113.832462 ]
