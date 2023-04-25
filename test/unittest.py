import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(
    executable_path ='chromedriver.exe'
)
driver.get("http://a0810081.xsph.ru/")

class MyTestCase(unittest.TestCase):
    def element(self):
