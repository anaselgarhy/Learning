import webbrowser
import mouse
from pynput.mouse import Button, Controller
import time

webbrowser.open('myu')
mouse = Controller()
positions = ((768, 512), (354, 437), (314, 252), (594, 536), (862, 369), (1154, 600), (1277, 44), (898, 411))
time_sleep = (5, 20, 100, 30, 20, 20, 15, 5400, 15)
i = 0
for position in positions:
    sec = time_sleep[i]
    mouse.position = position
    time.sleep(sec)
    mouse.click(Button.left, 1)
    if i == 2:
        time.sleep(20)
        webbrowser.open('https://vc1.mans.edu.eg')
        time.sleep(20)
        mouse.scroll(0, -4)
    i += 1
    if i >= len(positions):
        break
