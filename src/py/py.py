#!/usr/local/bin/python
 
import sys
 
try:
   # open file stream
   file = open(file_name, "w")
except IOError:
   print "There was an error writing to", file_name
   sys.exit()
print "Enter '", file_finish;

print "' When finished"
print '7'

while file_text != file_finish:
  file_text = raw_input("Enter text: ")
  if file_text == file_finish:
    # close the file
    file.close
    break
  file.write(file_text)
  file.write("n")
file.close()
file_name = raw_input("Enter filename: ")
