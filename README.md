# MyKotlinApp
Данная программа разбивает входящую строку на слова и создает из них массив.
Программа имеет 5 уровней, каждый из которых взаимодействует с массивом слов.
1. Уровень. Разбивает входящую строку на слова и формирует из последних массив.
2. Уровень. Сортирует иассив по алфавиту.
3. Уровень. Удаляет повторяющеся слова.
4. Уровень. Ведет подсчет повторяющихся слов.
5. Уровень. Сортирует массив сначала по количеству повторяющихся слов, а затем по алфавиту
Каждый из уровней должен выполянять условия предыдущего уровня. 

# Компилирование
Программа компилируется с помощью скрипта BUILD.sh.

# Запуск

Программа запускается с помощью скрипта RUN.sh.

# Тестирование

Программа тестируется  с помощью скрипта TEST.sh.

# Тестовые сценарии
Программа по умолчанию в скрипте TEST.sh имеет 4 тестовых сценария, но при желании вы можете их отредактировать.
Первые три тестовых сценария передают на вход некоторые предложения. программа, как говорилось ранее должна разбить строку на слова, посчитать, удалить повторяющиеся и сортировать.
Последний сценарий не передает ничего (пустая строка). Программа при данном условии все-равно работает и создает массив из 1 элемента.
