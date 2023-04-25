import unittest
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(
    executable_path ='chromedriver.exe'
)

class testing(unittest.TestCase):
    driver.get("http://a0810081.xsph.ru/")

    def testMenu(self):
        self.menu = driver.find_element(By.CLASS_NAME, "menu-icon")
        self.menu.click()
        time.sleep(1)

    def testSlider(self):
        self.slider = driver.find_element(By.CLASS_NAME, "slider__btn--prev")
        for i in range(0, 2):
            self.slider.click()
            time.sleep(2)

    def testSlider2(self):
        self.slider = driver.find_element(By.CLASS_NAME, "slider__btn--next")
        for i in range(0, 2):
            self.slider.click()
            time.sleep(2)

    def testSubscribe(self):
        self.subscribe = driver.find_element(By.CLASS_NAME, "subscribe-form__input")
        self.subscribe.send_keys("crkumcc@gmail.com")
        time.sleep(2)
        self.subscribe = driver.find_element(By.CLASS_NAME, "subscribe-form__btn")
        self.subscribe.click()