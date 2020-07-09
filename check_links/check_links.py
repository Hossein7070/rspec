import os
import sys
import re
import requests
from pathlib import Path

  
#walk all *.adoc files
def find_adoc():
  for path in Path('..').rglob('*.adoc'):
    find_links(path)

#find links
def find_links(path):
  with open(path) as f:
    s=f.read()
    results = re.findall(r'(https?://\S+)', s)
    if len(results) > 0:
      for link in results:
        if "'" not in link:
          valid_link(link[:link.find('[')],path)

#test links
def valid_link(link,path):
  try:
    r = requests.get(link)
    if r.status_code != 200:
      print(f"KO {link} in {path}")
  except Exception:
    print(f"Invalid URL: {link} in {path}")
def main():
  find_adoc()
  #find_links('../rules/S5527/javascript/rule.adoc')

if __name__ == '__main__':
  main()
