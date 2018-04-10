# radius of the bird
birdSize = 40
# x value of the center of the bird, never changes
birdOffset = 100
# width of the pipe, never changes
pipeSize = 40
# size of the gap in the pipe, never changes
gapSize = 130

# x value of the screen, is added by 1 every frame
x = 0
# y value of the bird, changes due to gravity and jumping
y = 300
# speed of the bird, is affected by gravity and jumping
dy = 0
# list of pipes visible on screen, we only have/need 3
pipes = [None] * 3
# current score
score = 0
# best/high score
best = 0
# number of tries
tries = 0


def setup():
    global y
    
    # initialize 600 by 600 screen
    size(600, 600)
    # set starting y position to the middle
    y = '''#1'''/2
    
    # spawn pipes to start the game
    '''#2'''()


# resets the pipes on dying
def resetGame():
    global pipes
    global x
    global y
    global dy
    global tries

    # reset x, y, dy, pipes as above
    x = 0
    y = height/2
    dy = 0
    pipes = [None] * 3
    # make random new pipes in specified positions
    for i in range(len(pipes)):
        # generate pipes at 300, 550, and 800. randomize gapSize between 50 and 420
        pipes[i] = [i*250 + '''#4''', random('''#5''', height-gapSize-50)]
        
    # add one to tries counter
    '''#6''' += 1
    

# respawn an individual pipe during game play
def respawnPipe(num):
    global tries
    global '''#7'''
    
    # random pipe location as above
    pipes[num] = [700, random(50, height-'''#8'''-50)]

    
def drawBird():
    global y
    global dy
    global birdOffset
    global birdSizes
    
    # yellow
    fill(240, 240, 0)
    # draw bird centered at (birdOffset, y)
    ellipse('''#9''', y, birdSize, birdSize)
    
    # gravity
    dy += 0.5
    # comment out the line above and uncomment out the line below, and see what happens :) 
    # y = mouseY
    
    # flap wings
    if keyPressed and key == ' ':
        # up velocity
        '''#10''' = -5
    
    # move bird
    '''#11''' += dy


def drawPipes():
    global pipes
    global gapSize
    global pipeSize
    global birdSize
    global birdOffset
    
    # green
    fill(0, 255, 0)
    for i, p in enumerate(pipes):
        # draw top of pipe
        rect(p[0], 0, '''#12''', p[1])
        # draw bottom of pipe
        rect(p['''#12'''], p[1]+gapSize, pipeSize, height-p[1]-gapSize)
        
        # move pipe
        pipes[i][0] -= 1
        
        # respawn pipe
        if '''#13'''[i][0]+pipeSize < 0:
            respawnPipe(i)
        
        # check for collisions between this pipe and ball by check x values first
        if p[0] < birdOffset+birdSize/2 and p[0]+pipeSize > birdOffset-birdSize/2:
            # then checking y values
            if y-birdSize/2 < p[1] or y+birdSize/2 > p[1]+gapSize:
                # reset game if hit
                resetGame()
        
        # kill bird if offscreen
        if y > '''#14''' or y < 0:
            resetGame()
        


def drawScore():
    global score
    global x
    global tries
    global best
    
    # update score
    score = (x + 50)/250
    
    # update high score
    if score > best:
        '''#15''' = score
    
    # red
    fill(255, 0, 0)
    # draw high scores onscreen
    text('High Score: ' + str(best), 50, 30)
    text('Score: ' + str('''#16'''), 50, 50)
    '''#17'''('Try #' + str(tries), 50, 70)



def draw():
    global x
    
    # blue sky
    '''#18'''(140, 140, 255)
    
    # add x
    x += 1
    
    # call the functions above
    '''#18'''()
    '''#19'''()
    '''#20'''()
