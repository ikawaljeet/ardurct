/*
 * Terminal - Most simple terminal: all received chars are shown on screen
 *
 * Copyright (c) 2010-2012 Laurent Wibaux <lm.wibaux@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

// Change the version to adapt to your screen
#define TOUSCRUINO_VERSION 1

#if (TOUSCRUINO_VERSION == 1)

#define FONT_SIZE FONT_SMALL
#define FONT_FACE FONT_PLAIN

#define TFT_CS 10
#define TFT_CD 9
#define TFT_RST 8

#include <SPI.h>
#include <ArduRCT_TouScruinoV1.h>

ArduRCT_TouScruinoV1 tft(TFT_CD, TFT_CS, TFT_RST);

#elif (TOUSCRUINO_VERSION == 2)

#define FONT_SIZE FONT_MEDIUM
#define FONT_FACE FONT_BOLD

#define TFT_PORT 2 // PortB
#define TFT_CD 	21
#define TFT_WR 	22
#define TFT_RD 	23
#define TFT_CS 	0xFF
#define TFT_RST 0xFF
#define TFT_BL 5

#include <ArduRCT_TouScruinoV2.h>

ArduRCT_TouScruinoV2 tft(TFT_PORT, TFT_CD, TFT_WR, TFT_RD, TFT_CS, TFT_RST, TFT_BL);

#endif

void setup() {
    Serial.begin(57600);
    tft.begin(WHITE, BLUE, FONT_SIZE, FONT_FACE);
	tft.setRotation(GRAPHICS_ROTATION_90);
}

void loop() {
    if (Serial.available() > 0) tft.write(Serial.read()); 
}