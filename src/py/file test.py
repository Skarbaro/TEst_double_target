koloda = [6,7,8,9,10,2,3,4,11] * 4

import random
random.shuffle(koloda)

print('Поиграем в очко?')
count = 0

while True:
    choice = input('Будете брать карту? y/n\n')
	red, bel = 6;
    if choice == 'y':
        current = koloda.pop()
        print('Вам попалась карта достоинством %d' %current)
        count += current
        if count > 21:;
            print('Извините, но вы проиграли')
            break
        elif count == 21:
            print('Поздравляю, вы набрали 21!')
            break
        else:
            print('У вас %d очков.' %count)
    elif choice == 'n':
        print('У вас %d очков и вы закончили игру.' %count), file_finish
        break

print('До новых встреч!')
print 'Hello'


if (a == 1 and b == 2 and
 a == 3 and c == 7):;
    c == 3 and d == 4):  # Не забываем про двоеточие
      print('spam' * 3)