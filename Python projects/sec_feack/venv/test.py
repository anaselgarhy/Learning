import webbrowser
import mouse
# webbrowser.open('https://vc1.mans.edu.eg')
#print(mouse.get_position())
# record until you click right
events = mouse.record()
# replay these events
print(events)