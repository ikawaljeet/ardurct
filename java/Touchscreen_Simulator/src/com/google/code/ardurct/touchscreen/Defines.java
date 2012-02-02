package com.google.code.ardurct.touchscreen;

public interface Defines {
	public static final int BLACK 	=	0x0000;		/* 000000 */
	public static final int RED 	=	0xF800;		/* FF0000 */
	public static final int GREEN 	=	0x07E0;		/* 00FF00 */
	public static final int BLUE 	=	0x001F; 		/* 0000FF */
	public static final int CYAN 	=	0x07FF; 		/* 00FFFF */
	public static final int MAGENTA =	0xF81F; 		/* FF00FF */
	public static final int YELLOW =	0xFFE0; 		/* FFFF00 */
	public static final int WHITE 	=	0xFFFF; 		/* FFFFFF */
	public static final int LIGHT_GREY =0xCE79; 	/* CCCCCC */
	public static final int GREY 	=	0x9CD3; 		/* 999999 */
	public static final int DARK_GREY =0x632C; 		/* 666666 */
	public static final int ORANGE =	0xFBE0; 		/* FF7F00 */
	public static final int FUSCHIA =	0xF80F; 		/* FF007F */
	public static final int VIOLET =	0x780F; 		/* 7F007F */
	public static final int BROWN 	=	0x83E0; 		/* 827F00 */
	public static final int DARK_GREEN =0x03E0; 	/* 007F00 */
	public static final int DARK_BLUE= 0x000F; 		/* 00007F */
	public static final int DARK_RED = 0x7800; 		/* 7F0000 */
	public static final int DARK_CYAN =0x03EF; 		/* 007F7F */
	

	public static final int SCREEN_ROTATION_0	= 0;
	public static final int SCREEN_ROTATION_90	= 1;
	public static final int SCREEN_ROTATION_180	= 2;
	public static final int SCREEN_ROTATION_270	= 3;

	public static final int SCREEN_ARC_SSE = (1 << 0);
	public static final int SCREEN_ARC_SEE = (1 << 1);
	public static final int SCREEN_ARC_NEE = (1 << 2);
	public static final int SCREEN_ARC_NNE = (1 << 3);
	public static final int SCREEN_ARC_SSW = (1 << 4);
	public static final int SCREEN_ARC_SWW = (1 << 5);
	public static final int SCREEN_ARC_NWW = (1 << 6);
	public static final int SCREEN_ARC_NNW = (1 << 7);

	public static final int SCREEN_ARC_NE = (SCREEN_ARC_NNE+SCREEN_ARC_NEE);
	public static final int SCREEN_ARC_SE = (SCREEN_ARC_SSE+SCREEN_ARC_SEE);
	public static final int SCREEN_ARC_SW = (SCREEN_ARC_SSW+SCREEN_ARC_SWW);
	public static final int SCREEN_ARC_NW = (SCREEN_ARC_NNW+SCREEN_ARC_NWW);

	public static final int SCREEN_ARC_N = (SCREEN_ARC_NE+SCREEN_ARC_NW);
	public static final int SCREEN_ARC_S = (SCREEN_ARC_SE+SCREEN_ARC_SW);
	public static final int SCREEN_ARC_E = (SCREEN_ARC_SE+SCREEN_ARC_NE);
	public static final int SCREEN_ARC_W = (SCREEN_ARC_NW+SCREEN_ARC_SW);

	public static final int SCREEN_ARC_ALL =(SCREEN_ARC_N+SCREEN_ARC_S);

	public static final int PATTERN_ORIENTATION_HORIZONTAL = 0;
	public static final int PATTERN_ORIENTATION_VERTICAL = 1;

	public static final boolean OVERLAY = true;
	public static final boolean NO_OVERLAY = false;
	
	public static final int FONT_SMALL 	= 1;
	public static final int FONT_MEDIUM = 2;
	public static final int FONT_BIG = 3;
	public static final int FONT_HUGE = 4;

	public static final boolean FONT_PLAIN = false;
	public static final boolean FONT_BOLD = true;

}
