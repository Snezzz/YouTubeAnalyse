# Проект по дипломной работе

### Системные требования:
  * OS: Windows x86/x86_64, Linux x86/x86_64  
  * Оперативная память (RAM): 13n Free RAM, где n - минимальное количество видео в запросе  
  * Для сборки: версия Java не ниже 1.8 
### Сборка из исходников:  
1.Установите Java  
2.Установите Apache Maven (http://maven.apache.org)  
3.В терминале: ```mvn compile```  
4.```mvn assembly:single```  

## Запуск проекта:  
### Вариант 1:  
[Скачайте](https://drive.google.com/file/d/1Dliqm6TVPEMTNP4pFhRUwglm-fZi3lEa/view?usp=sharing) готовый билд
### Вариант 2:  
1.```git clone```    
2.```java -jar .jar```
### Вариант 3 (через InteliJ IDEA):
1.```git clone```    
2.Открываем все три модуля в одном проекте (File->New->Module from Existing Sources)  
3.Run -> Edit Configurations-> New -> Application  
4.Main class: Main, Use classpath of module: YouTubeAnalyse  
5.Run

## Описание проекта
  Проект посвящен анализу AD HOC дискусский в социальной сети Youtube  
    Язык программирования: Java   
    Используемые библиотеки: Gson, YouTube Data API, Gephi Toolkit, SaX,XmlPull  
    База данных: PostgreSQL

####Текущий модуль отвечает за:

1.Загрузку данных (связь с модулем [YouTubeVideo](https://github.com/Snezzz/YouTubeVideo))  
2.Построение графа по данным из БД (связь с модулем [YouTubeGetData](https://github.com/Snezzz/YouTubeGetData))
