y = 0
dy = 0
offset = 0
pipes = []
gapSize = 100

def setup():
    global y
    global gapSize
    
    size(600, 600)
    
    y = height/2
    
    for i in range(4):
        pipes.append([map(i, 0, 3, 300, 900), random(0, height-gapSize)])
    
    print pipes


def draw():
    global y
    global dy
    global gapSize
    
    radius = 40
    
    background(80, 80, 255)
    
    
    # stop bird if below screen
    if y > height+radius:
        dy = 0
    else:
        dy += 1
        y += dy
    
    # flap bird
    if keyPressed:
        if key == ' ':
            dy = -10
            y += dy
    
    # draw pipes
    fill(0, 255, 0)
    for i, p in enumerate(pipes):
        rect(p[0], 0, 40, height)
        
        pushStyle()
        fill(80, 80, 255)
        noStroke()
        rect(p[0], p[1], 41, gapSize)
        popStyle()
        
        pipes[i][0] -= 3
        
        # regenerate pipes if offscreen
        if pipes[i][0] < -40:
            pipes[i][0] = 750
            pipes[i][1] = random(0, height-gapSize)
    
    # bird
    fill(255, 255, 0)
    ellipse(50, y, radius, radius)
    
    
