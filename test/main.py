import time

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(
    executable_path = './chromedriver.exe'
)
driver.get("http://a0810081.xsph.ru/")

element = driver.find_element(By.CLASS_NAME, "slider__btn--prev")
for i in range(0, 1000):
    element.click()
    time.sleep(5)