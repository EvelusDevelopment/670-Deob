import jaclib.memory.Stream;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

abstract class ta {

   static int s;
   Hashtable y = new Hashtable();
   static int v;
   static int I;
   static int o;
   static int z;
   static int d;
   static int f_i;
   static int u;
   gv m;
   static int a;
   ue E;
   static int e;
   static int r;
   static int F;
   int G;
   static int B;
   static int t;
   static int j;
   qa k;
   static int w;
   static int c;
   static int h;
   static Object[] b = ho.a(-1, 57, new Object[1], true);
   static int x;
   static int A;
   static int f;
   private int g = -1;
   static int p;
   static int D;
   static int J;
   static int H;
   static int n;
   static int q;
   private hsa[] C = new hsa[4];
   static int f_l;


   abstract void Z(int var1, int var2);

   final void a(int var1, int var2, int var3, int var4, int var5) {
      this.S(var5, var1, var3, var2, var4);
      ++p;
   }

   abstract void g(int var1);

   abstract hsa f();

   abstract Object[] E();

   abstract boolean D();

   abstract void d(Object[] var1);

   abstract boolean u();

   Object[] a(int var1, int var2, int var3, int var4, int var5, float var6) {
      ++s;
      Object[] var8 = new Object[4];
      tea.a(1, var8);
      jea.a(var8, (byte)-128);
      if(var8 != null && (-2 == ~var8.length && var8[0].equals(Integer.valueOf(0)) || var8.length == 6)) {
         this.y = null;
      }

      cra var10 = new cra(var8);
      var8[3] = var10;
      Class_cs.a((float)var3, (float)var1, (float)var2, (Object[])((Object[])var8[2]), (byte)125);
      ((int[])((int[])var8[1]))[0] = var5;
      ((int[])((int[])var8[1]))[1] = var4;
      ((float[])((float[])var8[0]))[0] = var6;
      return var8;
   }

   abstract int a(int var1, int var2, int var3, int var4, int var5, int var6);

   final void b(Canvas var1, int var2) {
      if(this.y.containsKey(var1)) {
         gv var3 = (gv)this.y.get(var1);
         var3.c();
         this.y.remove(var1);
      }

      ++j;
      int var4 = 98 % ((var2 + 64) / 46);
   }

   final void a(int var1, int var2, int var3, int var4, byte var5, int var6) {
      this.e(var6, var4, var2, var3, var1, 1);
      ++I;
      if(var5 != -71) {
         this.g = 86;
      }

   }

   abstract boolean A();

   abstract void ra();

   static final Object[] a(Object[] var0, boolean var1, int var2, Object[] var3) {
      if(null == var3[0]) {
         var3[0] = new int[2];
      }

      if(var3[16] == null) {
         var3[16] = new long[1];
      }

      ++F;
      sea.b(var0, var3, (byte)-127);
      int var4 = de.a((int)0, var0);
      if(var2 >= -109) {
         a((String)b[11], (String)null, true, 106, ((boolean[])((boolean[])var3[3]))[3]);
      }

      if(!var1) {
         ((long[])((long[])var3[16]))[0] = (long)var4;
      } else {
         ((long[])((long[])var3[16]))[0] = 4294967296L | (long)var4;
      }

      ((int[])((int[])var3[0]))[1] = lr.a(1, var0);
      return var3;
   }

   abstract void a(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

   abstract void EA(int var1, Class_s var2, int var3, int var4);

   abstract void a();

   abstract boolean m();

   static final synchronized ta a(int var0, int var1, qa var2, int var3, int var4, Canvas var5, int var6, Object[] var7) {
      try {
         ++u;
         if(0 != var1) {
            if(2 == var1) {
               return Class_f.a(var0, var4, var2, (byte)95, var5);
            } else if(1 != var1) {
               if(5 == var1) {
                  return sja.a(var3, 106, var7, var2, var5);
               } else if(3 == var1) {
                  return gq.a(var2, 0, var3, var7, var5);
               } else {
                  if(var6 != 128) {
                     a((String)b[5], (String)((Object[])((Object[])var7[1]))[3], ((boolean[])((boolean[])b[0]))[8], ((int[])((int[])var7[1]))[0], ((boolean[])((boolean[])b[14]))[24]);
                  }

                  throw new IllegalArgumentException("");
               }
            } else {
               Object[] var11 = new Object[61];
               if(null == var11[1]) {
                  var11[1] = new int[40];
               }

               if(var11[17] == null) {
                  var11[17] = new boolean[31];
               }

               if(var11[41] == null) {
                  var11[41] = new long[1];
               }

               if(var11[25] == null) {
                  var11[25] = new float[20];
               }

               uc.b(var11, var6 - 241);
               var11[55] = kl.a(88, var11, var2);

               try {
                  ((int[])((int[])var11[1]))[2] = var3;
                  if(!hp.a((byte)-8, "jaclib")) {
                     throw new RuntimeException("");
                  }

                  if(!hp.a((byte)-103, "jaggl")) {
                     throw new RuntimeException("");
                  }

                  var11[27] = new OpenGL();
                  long var13 = ((OpenGL)var11[27]).init(var5, 8, 8, 8, 24, 0, ((int[])((int[])var11[1]))[2]);
                  if(-1L == ~var13) {
                     throw new RuntimeException("");
                  }

                  gr.a((byte)118, var11);
                  int var16 = 0;
                  var11[47] = OpenGL.glGetString(7936).toLowerCase();
                  var11[16] = OpenGL.glGetString(7937).toLowerCase();
                  if(0 != ~((String)var11[47]).indexOf("microsoft")) {
                     var16 |= 1;
                  }

                  if(null != var7 && -15 == ~var7.length && var7[2].equals(Boolean.valueOf(false)) && var7[2].equals(Boolean.valueOf(false))) {
                     wh.c = null;
                  }

                  if(-1 != ((String)var11[47]).indexOf("brian paul") || 0 != ~((String)var11[47]).indexOf("mesa")) {
                     var16 |= 1;
                  }

                  String var17 = OpenGL.glGetString(7938);
                  String[] var18 = ul.a(0, var17.replace('.', ' '), ' ');
                  if(var18.length < 2) {
                     var16 |= 4;
                  } else {
                     try {
                        int var19 = bca.a((byte)-126, var18[0]);
                        int var20 = bca.a((byte)23, var18[1]);
                        ((int[])((int[])var11[1]))[24] = var20 + var19 * 10;
                     } catch (NumberFormatException var54) {
                        var16 |= 4;
                     }
                  }

                  if(((int[])((int[])var11[1]))[24] < 12) {
                     var16 |= 2;
                  }

                  if(!((OpenGL)var11[27]).a("GL_ARB_multitexture")) {
                     var16 |= 8;
                  }

                  if(!((OpenGL)var11[27]).a("GL_ARB_texture_env_combine")) {
                     var16 |= 32;
                  }

                  int[] var59 = new int[1];
                  OpenGL.glGetIntegerv('\u84e2', var59, 0);
                  ((int[])((int[])var11[1]))[22] = var59[0];
                  OpenGL.glGetIntegerv('\u8871', var59, 0);
                  ((int[])((int[])var11[1]))[35] = var59[0];
                  OpenGL.glGetIntegerv('\u8872', var59, 0);
                  ((int[])((int[])var11[1]))[18] = var59[0];
                  if(((int[])((int[])var11[1]))[22] < 2 || ((int[])((int[])var11[1]))[35] < 2 || ((int[])((int[])var11[1]))[18] < 2) {
                     var16 |= 16;
                  }

                  boolean[] var64 = (boolean[])((boolean[])var11[17]);
                  boolean var21 = Stream.b;
                  var64[11] = var21;
                  ((boolean[])((boolean[])var11[17]))[15] = ((OpenGL)var11[27]).a("GL_ARB_vertex_buffer_object");
                  ((boolean[])((boolean[])var11[17]))[13] = ((OpenGL)var11[27]).a("GL_ARB_multisample");
                  ((boolean[])((boolean[])var11[17]))[1] = ((OpenGL)var11[27]).a("GL_ARB_vertex_program");
                  ((OpenGL)var11[27]).a("GL_ARB_fragment_program");
                  ((boolean[])((boolean[])var11[17]))[28] = ((OpenGL)var11[27]).a("GL_ARB_vertex_shader");
                  ((boolean[])((boolean[])var11[17]))[3] = ((OpenGL)var11[27]).a("GL_ARB_fragment_shader");
                  ((boolean[])((boolean[])var11[17]))[22] = ((OpenGL)var11[27]).a("GL_EXT_texture3D");
                  ((boolean[])((boolean[])var11[17]))[5] = ((OpenGL)var11[27]).a("GL_ARB_texture_rectangle");
                  ((boolean[])((boolean[])var11[17]))[4] = ((OpenGL)var11[27]).a("GL_ARB_texture_cube_map");
                  ((boolean[])((boolean[])var11[17]))[18] = ((OpenGL)var11[27]).a("GL_ARB_texture_float");
                  ((boolean[])((boolean[])var11[17]))[27] = false;
                  ((boolean[])((boolean[])var11[17]))[0] = ((OpenGL)var11[27]).a("GL_EXT_framebuffer_object");
                  ((boolean[])((boolean[])var11[17]))[25] = ((OpenGL)var11[27]).a("GL_EXT_framebuffer_blit");
                  ((boolean[])((boolean[])var11[17]))[9] = ((OpenGL)var11[27]).a("GL_EXT_framebuffer_multisample");
                  ((boolean[])((boolean[])var11[17]))[19] = ((boolean[])((boolean[])var11[17]))[9] & ((boolean[])((boolean[])var11[17]))[25];
                  ((boolean[])((boolean[])var11[17]))[2] = ela.b.startsWith("mac");
                  OpenGL.glGetFloatv(2834, oga.q, 0);
                  int var15 = var16 != 0?var16:0;
                  ((float[])((float[])var11[25]))[8] = oga.q[0];
                  ((float[])((float[])var11[25]))[12] = oga.q[1];
                  if(0 != var15) {
                     throw new RuntimeException("");
                  }

                  ((int[])((int[])var11[1]))[37] = ((boolean[])((boolean[])var11[17]))[11]?'\u8367':5121;
                  int var58;
                  if(((String)var11[16]).indexOf("radeon") != -1) {
                     var58 = 0;
                     boolean var61 = false;
                     boolean var65 = false;
                     if(null != var11 && var11.length == 10) {
                        a(47, 56, (qa)null, 59, 31, (Canvas)null, 128, (Object[])null);
                     }

                     String[] var62 = ul.a(0, ((String)var11[16]).replace('/', ' '), ' ');

                     for(int var67 = 0; ~var67 > ~var62.length; ++var67) {
                        String var22 = var62[var67];

                        try {
                           if(-1 > ~var22.length()) {
                              if(var22.charAt(0) == 120 && var22.length() >= 3 && ft.a((byte)-112, var22.substring(1, 3))) {
                                 var22 = var22.substring(1);
                                 var65 = true;
                              }

                              if(var22.equals("hd")) {
                                 var61 = true;
                              } else {
                                 if(var22.startsWith("hd")) {
                                    var61 = true;
                                    var22 = var22.substring(2);
                                 }

                                 if(var22.length() >= 4 && ft.a((byte)-92, var22.substring(0, 4))) {
                                    var58 = bca.a((byte)-122, var22.substring(0, 4));
                                    break;
                                 }
                              }
                           }
                        } catch (Exception var55) {
                           ;
                        }
                     }

                     if(!var61 || var58 < 4000) {
                        ((boolean[])((boolean[])var11[17]))[18] = false;
                     }

                     if(!var65 && !var61) {
                        if(var58 >= 7000 && var58 <= 7999) {
                           ((boolean[])((boolean[])var11[17]))[15] = false;
                        }

                        if(var58 >= 7000 && 9250 >= var58) {
                           ((boolean[])((boolean[])var11[17]))[22] = false;
                        }
                     }

                     ((boolean[])((boolean[])var11[17]))[5] &= ((OpenGL)var11[27]).a("GL_ARB_half_float_pixel");
                     ((boolean[])((boolean[])var11[17]))[21] = ((boolean[])((boolean[])var11[17]))[15];
                     ((boolean[])((boolean[])var11[17]))[12] = true;
                  }

                  if(~((String)var11[47]).indexOf("intel") != 0) {
                     ((boolean[])((boolean[])var11[17]))[0] = false;
                  }

                  ((boolean[])((boolean[])var11[17]))[16] = !((String)var11[47]).equals("s3 graphics");
                  if(((boolean[])((boolean[])var11[17]))[15]) {
                     try {
                        int[] var60 = new int[1];
                        OpenGL.glGenBuffersARB(1, var60, 0);
                     } catch (Throwable var53) {
                        throw new RuntimeException("");
                     }
                  }

                  tia.a(-927416089, true, false);
                  ((boolean[])((boolean[])var11[17]))[29] = true;
                  var11[49] = noa.a(var6 ^ 384, new Object[3], ((ta)var11[55]).k, var11);
                  var11[18] = new Object[((int[])((int[])var11[1]))[22]][];
                  var11[7] = kaa.a(3553, 1, ah.f, new Object[6], 1, vk.f, var11, var6 - 126);
                  kaa.a(3553, 1, ah.f, new Object[6], 1, vk.f, var11, 2);
                  kaa.a(3553, 1, ah.f, new Object[6], 1, vk.f, var11, 2);

                  for(var58 = 0; var58 < 7; ++var58) {
                     ((qna[])((qna[])var11[20]))[var58] = new qna(var11);
                     ((qna[])((qna[])var11[9]))[var58] = new qna(var11);
                  }

                  if(((boolean[])((boolean[])var11[17]))[0]) {
                     var11[30] = el.a(true, var11, new Object[5]);
                     el.a(true, var11, new Object[5]);
                  }

                  Object[] var63 = new Object[]{var11, null};
                  var11[28] = var63;
                  var11[34] = pha.a(new Object[12], var11, false);
                  Object[] var68 = (Object[])((Object[])var11[34]);
                  boolean var66 = var68[7] != null;
                  if(var68 != null && var68.length == 17) {
                     jla.a((Canvas)null, 88, (qa)null, 0, true, (Object[])null);
                  }

                  Object[] var24;
                  if(var66) {
                     var24 = new Object[13];
                     fe.b(var6 - 124, var24);
                     if(var24[2] == null) {
                        var24[2] = new boolean[1];
                     }

                     ica var26 = new ica(var24);
                     var24[1] = var11;
                     var24[0] = var26;
                     var11[33] = var24;
                     Object[] var69 = (Object[])((Object[])var11[33]);
                     boolean var25 = ((boolean[])((boolean[])((Object[])((Object[])var69[1]))[17]))[0] && ((boolean[])((boolean[])((Object[])((Object[])var69[1]))[17]))[3] && ((boolean[])((boolean[])((Object[])((Object[])var69[1]))[17]))[18];
                     if(!var25) {
                        fra.a((Object[])((Object[])var11[33]), true);
                        var11[33] = null;
                     }
                  }

                  Object[] var12;
                  ((ta)var11[55]).a(var5, (gv)(null == (var12 = rb.a(new Object[7], (byte)37, var13, var5, var11))?null:var12[4]), 8);
                  ((ta)var11[55]).a(var5, -124);
                  var24 = new Object[5];
                  aca.b(var24, (byte)-120);
                  cva.a((byte)10, var24);
                  var24[0] = var11;
                  Object[] var27 = new Object[6];
                  cfa.a(-11, var27);
                  jsa.a(var6 - 129, var27);
                  ((boolean[])((boolean[])var27[5]))[0] = ((boolean[])((boolean[])var11[17]))[22];
                  rv.b(128, var11);
                  Object[] var29;
                  Object[] var30;
                  if(((boolean[])((boolean[])var27[5]))[0]) {
                     byte[] var28 = ad.a(false, ne.d, -94);
                     var27[4] = rw.a(var11, (byte)50, var28, 128, lna.f, vk.f, 128, new Object[6], 16, lna.f);
                     var28 = ad.a(false, ee.b, -106);
                     var27[1] = rw.a(var11, (byte)50, var28, 128, lna.f, vk.f, 128, new Object[6], 16, lna.f);
                     var29 = (Object[])((Object[])var11[28]);
                     if(fi.a(var29, var6 - 125)) {
                        var28 = ad.a(false, ke.d, var6 - 225);
                        var27[2] = hp.a((byte)2, vk.f, 16, new Object[6], 128, var11, ah.f, 128);
                        var30 = rw.a(var11, (byte)50, var28, 128, at.c, vk.f, 128, new Object[6], 16, at.c);
                        if(bba.a(var6 - 125, var30, (Object[])((Object[])var27[2]), var29, 2.0F)) {
                           sja.a((Object[])((Object[])var27[2]), -103);
                        } else {
                           hw.a((Object[])((Object[])var27[2]), -16774);
                           var27[2] = null;
                        }

                        hw.a(var30, var6 ^ -16646);
                     }
                  } else {
                     var27[3] = new Object[16][];

                     byte[] var71;
                     int var72;
                     for(var72 = 0; var72 < 16; ++var72) {
                        var71 = qn.a(0, ne.d, 128 * 128 * var72 * 2, '\u8000');
                        ((Object[][])((Object[][])var27[3]))[var72] = wqa.a(new Object[6], lna.f, vk.f, lna.f, false, 1, 3553, 128, true, 128, var71, var11);
                     }

                     var27[0] = new Object[16][];

                     for(var72 = 0; var72 < 16; ++var72) {
                        var71 = qn.a(0, ee.b, var72 * 128 * 128 * 2, '\u8000');
                        ((Object[][])((Object[][])var27[0]))[var72] = wqa.a(new Object[6], lna.f, vk.f, lna.f, false, 1, 3553, 128, true, 128, var71, var11);
                     }

                     if(var7 != null && -5 == ~var7.length) {
                        wh.c = null;
                     }
                  }

                  Object[] var31;
                  Object[][] var70;
                  label475: {
                     var24[2] = var27;
                     var24[3] = new Object[16][];
                     ((Object[][])((Object[][])var24[3]))[1] = go.a(var11, (byte)-123, new Object[8]);
                     var70 = (Object[][])((Object[][])var24[3]);
                     var30 = new Object[10];
                     var31 = (Object[])((Object[])var24[2]);
                     aa.b(var30, 1);
                     hp.a(var11, var30, 27468);
                     var30[2] = var31;
                     if(((boolean[])((boolean[])((Object[])((Object[])var30[0]))[17]))[1] && ((int[])((int[])((Object[])((Object[])var30[0]))[1]))[22] >= 2) {
                        var30[5] = mw.a((Object[])((Object[])var30[0]), "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", '\u8620', '\u8875');
                        if(null == var30[5]) {
                           var29 = var30;
                           break label475;
                        }

                        int[][] var32 = gn.a(4, false, -95, 256, 4, 64, 0.4F, 3, 0);
                        int[][] var33 = gn.a(4, false, 54, 256, 4, 64, 0.4F, 3, 8);
                        int var34 = 0;
                        var30[9] = new float['\u8000'];
                        if(var11 != null && var11.length == 3 && var11[2].equals(Boolean.valueOf(false))) {
                           wh.c = null;
                        }

                        for(int var35 = 0; var35 < 256; ++var35) {
                           int[] var36 = var32[var35];
                           int[] var37 = var33[var35];
                           if(var11 != null && var11.length == 21 && var11[14].equals(Integer.valueOf(0))) {
                              wh.c = null;
                           }

                           for(int var38 = 0; 64 > var38; ++var38) {
                              ((float[])((float[])var30[9]))[var34++] = (float)var36[var38] / 4096.0F;
                              ((float[])((float[])var30[9]))[var34++] = (float)var37[var38] / 4096.0F;
                           }
                        }

                        aca.a(var30, (byte)127);
                     }

                     var29 = var30;
                  }

                  var70[2] = var29;
                  Object[][] var73 = (Object[][])((Object[][])var24[3]);
                  Object[] var76 = new Object[4];
                  Object[] var75 = (Object[])((Object[])var24[2]);
                  hp.a(var11, var76, 27468);
                  var76[1] = var75;
                  var76[2] = qoa.a(2, new Object[1], 110, (Object[])((Object[])var76[0]));
                  tia.a((Object[])((Object[])var76[2]), 0, -118);
                  nha.a((Object[])((Object[])var76[0]), 18806, 1);
                  el.a(260, 30862, 7681, (Object[])((Object[])var76[0]));
                  af.a(768, (Object[])((Object[])var76[0]), 30579, '\u8578', 0);
                  OpenGL.glTexGeni(8192, 9472, 9216);
                  OpenGL.glEnable(3168);
                  nha.a((Object[])((Object[])var76[0]), 18806, 0);
                  OpenGL.glTexEnvf(8960, '\u8573', 2.0F);
                  if(((boolean[])((boolean[])((Object[])((Object[])var76[1]))[5]))[0]) {
                     OpenGL.glTexGeni(8194, 9472, 9217);
                     OpenGL.glTexGeni(8195, 9472, 9217);
                     OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
                     OpenGL.glEnable(3170);
                     OpenGL.glEnable(3171);
                  }

                  fta.a((byte)127, (Object[])((Object[])var76[2]));
                  tia.a((Object[])((Object[])var76[2]), 1, var6 ^ -247);
                  nha.a((Object[])((Object[])var76[0]), 18806, 1);
                  el.a(8448, var6 ^ 30734, 8448, (Object[])((Object[])var76[0]));
                  af.a(768, (Object[])((Object[])var76[0]), 30579, 5890, 0);
                  OpenGL.glDisable(3168);
                  nha.a((Object[])((Object[])var76[0]), 18806, 0);
                  OpenGL.glTexEnvf(8960, '\u8573', 1.0F);
                  if(((boolean[])((boolean[])((Object[])((Object[])var76[1]))[5]))[0]) {
                     OpenGL.glDisable(3170);
                     OpenGL.glDisable(3171);
                  }

                  fta.a((byte)85, (Object[])((Object[])var76[2]));
                  Object[] var77 = new Object[6];
                  Object[] var39 = (Object[])((Object[])var76[0]);
                  Object[] var40 = br.f;
                  Object[] var41 = vk.f;
                  byte[] var42 = new byte[]{(byte)0, (byte)-1};
                  Object[] var43 = br.f;
                  cia.a(var77, (byte)-81);
                  np.a(1, var40, var39, 3552, var77, var41, false, 2);
                  ((int[])((int[])var77[1]))[3] = 2;
                  moa.a((byte)127, var77, (Object[])((Object[])var77[4]));
                  OpenGL.glPixelStorei(3317, 1);
                  OpenGL.glTexImage1Dub(((int[])((int[])var77[1]))[2], 0, bu.a(83, (Object[])((Object[])var77[5]), (Object[])((Object[])var77[2])), ((int[])((int[])var77[1]))[3], 0, rha.b(var6 ^ 136, var43), 5121, var42, 0);
                  OpenGL.glPixelStorei(3317, 4);
                  gg.a((byte)-88, var77, true);
                  var76[3] = var77;
                  Object[] var44 = (Object[])((Object[])var76[3]);
                  moa.a((byte)125, var44, (Object[])((Object[])var44[4]));
                  OpenGL.glTexParameteri(((int[])((int[])var44[1]))[2], 10242, '\u812f');
                  if(var31 != null && (var31.length == 8 || -8 == ~var31.length || var31.length == 7)) {
                     wh.c = null;
                  }

                  var73[4] = var76;
                  Object[][] var74 = (Object[][])((Object[][])var24[3]);
                  var77 = new Object[5];
                  var39 = (Object[])((Object[])var24[2]);
                  hp.a(var11, var77, var6 + 27340);
                  var77[4] = var39;
                  var77[3] = qoa.a(2, new Object[1], 115, var11);
                  tia.a((Object[])((Object[])var77[3]), 0, -111);
                  nha.a((Object[])((Object[])var77[0]), 18806, 1);
                  if(((boolean[])((boolean[])((Object[])((Object[])var77[4]))[5]))[0]) {
                     OpenGL.glTexGeni(8194, 9472, 9217);
                     OpenGL.glEnable(3170);
                  }

                  OpenGL.glTexGeni(8192, 9472, 9216);
                  OpenGL.glTexGeni(8193, 9472, 9216);
                  OpenGL.glEnable(3168);
                  OpenGL.glEnable(3169);
                  nha.a((Object[])((Object[])var77[0]), var6 ^ 18934, 0);
                  fta.a((byte)84, (Object[])((Object[])var77[3]));
                  tia.a((Object[])((Object[])var77[3]), 1, var6 ^ -201);
                  nha.a((Object[])((Object[])var77[0]), var6 ^ 18934, 1);
                  if(((boolean[])((boolean[])((Object[])((Object[])var77[4]))[5]))[0]) {
                     OpenGL.glDisable(3170);
                  }

                  OpenGL.glDisable(3168);
                  OpenGL.glDisable(3169);
                  nha.a((Object[])((Object[])var77[0]), 18806, 0);
                  if(var76 != null && -2 == ~var76.length) {
                     wh.c = null;
                  }

                  fta.a((byte)124, (Object[])((Object[])var77[3]));
                  var74[5] = var77;
                  Object[][] var78 = (Object[][])((Object[][])var24[3]);
                  Object[] var79 = new Object[2];
                  hp.a(var11, var79, 27468);
                  var78[6] = var79;
                  ((Object[][])((Object[][])var24[3]))[7] = gj.a(var11, false, new Object[3]);
                  Object[][] var80 = (Object[][])((Object[][])var24[3]);
                  Object[] var46 = new Object[9];
                  if(var46[8] == null) {
                     var46[8] = new boolean[4];
                  }

                  hp.a(var11, var46, 27468);
                  dj.a(28599, var46);
                  if(((boolean[])((boolean[])((Object[])((Object[])var46[0]))[17]))[1]) {
                     var46[3] = mw.a((Object[])((Object[])var46[0]), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", '\u8620', '\u8875');
                     var46[7] = mw.a((Object[])((Object[])var46[0]), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", '\u8620', '\u8875');
                     var46[4] = mw.a((Object[])((Object[])var46[0]), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", '\u8620', var6 ^ '\u88f5');
                     var46[2] = mw.a((Object[])((Object[])var46[0]), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", '\u8620', '\u8875');
                     if(!(null != var46[2] & null != var46[4] & null != var46[7] & null != var46[3])) {
                        ((boolean[])((boolean[])var46[8]))[2] = false;
                     } else {
                        var46[5] = wqa.a(new Object[6], br.f, vk.f, br.f, false, var6 - 127, 3553, 1, false, 2, new byte[]{(byte)0, (byte)-1}, var11);
                        pda.a(false, false, (Object[])((Object[])var46[5]), false);
                        ((boolean[])((boolean[])var46[8]))[2] = true;
                     }
                  } else {
                     ((boolean[])((boolean[])var46[8]))[2] = false;
                  }

                  var80[3] = (Object[])(var24[4] = var46);
                  Object[][] var47 = (Object[][])((Object[][])var24[3]);
                  Object[] var49 = new Object[7];
                  Object[] var50 = (Object[])((Object[])var24[2]);
                  if(var49[6] == null) {
                     var49[6] = new boolean[2];
                  }

                  hp.a(var11, var49, 27468);
                  ((boolean[])((boolean[])var49[6]))[0] = false;
                  ((boolean[])((boolean[])var49[6]))[1] = false;
                  var49[5] = var50;
                  if(null != ((Object[])((Object[])var49[5]))[2] && ((boolean[])((boolean[])((Object[])((Object[])var49[0]))[17]))[28] && ((boolean[])((boolean[])((Object[])((Object[])var49[0]))[17]))[3]) {
                     Object[] var51 = rna.a((Object[])((Object[])var49[0]), '\u8b31', "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", -21129);
                     Object[] var52 = rna.a((Object[])((Object[])var49[0]), '\u8b30', "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", -21129);
                     var49[3] = vga.a((Object[])((Object[])var49[0]), false, new Object[][]{var51, var52});
                     ((boolean[])((boolean[])var49[6]))[1] = null != var49[3];
                  }

                  var47[8] = var49;
                  ((Object[][])((Object[][])var24[3]))[9] = oo.a(var11, 2, new Object[6], (Object[])((Object[])var24[2]));
                  if(!wk.a(((Object[][])((Object[][])var24[3]))[8], -10057)) {
                     ((Object[][])((Object[][])var24[3]))[8] = ((Object[][])((Object[][])var24[3]))[4];
                  }

                  if(!wk.a(((Object[][])((Object[][])var24[3]))[9], -10057)) {
                     ((Object[][])((Object[][])var24[3]))[9] = ((Object[][])((Object[][])var24[3]))[8];
                  }

                  var11[12] = var24;
                  qp.a((byte)94, var11);
                  vl.a((byte)-33, var11);
               } catch (Throwable var56) {
                  var56.printStackTrace();
                  ((ta)var11[55]).a((byte)17);
                  if(var56 instanceof OutOfMemoryError) {
                     throw (OutOfMemoryError)var56;
                  }

                  throw new RuntimeException("");
               }

               ta var8 = (ta)(null == var11?null:var11[55]);
               return var8;
            }
         } else {
            return fh.a(var0, var6 ^ 130, var4, var2, var5);
         }
      } catch (RuntimeException var57) {
         throw vt.a(var57, "ta.PE(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ',' + (var7 != null?"{...}":"null") + ')');
      }
   }

   abstract void oa(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

   abstract void t();

   abstract void V(int var1, int var2, int var3, int var4);

   abstract void JA(int var1, int var2, int var3, int var4);

   abstract cga a(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

   abstract void e(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract boolean p();

   abstract ja a(Object[] var1, aea[] var2, boolean var3);

   static final Object[] a(ta var0, Object[] var1, byte var2, Object[] var3, int var4) {
      ++q;
      if(var3[2] == null) {
         var3[2] = new boolean[2];
      }

      if(var3[1] == null) {
         var3[1] = new int[7];
      }

      if(gpa.b == null) {
         gpa.b = pca.a(4, true, 35, 2, 0.4F, 2048, 8, 8);
      }

      ((int[])((int[])var3[1]))[5] = fh.a(var1, false);
      ((boolean[])((boolean[])var3[2]))[1] = (16 & ((int[])((int[])var3[1]))[5]) != 0;
      ((boolean[])((boolean[])var3[2]))[0] = (((int[])((int[])var3[1]))[5] & 8) != 0;
      ((int[])((int[])var3[1]))[5] &= 7;
      int var5 = de.a((int)0, var1) << var4;
      int var6 = de.a((int)0, var1) << var4;
      if(null != var1 && -10 == ~var1.length) {
         a((ta)null, (Object[])null, (byte)-53, (Object[])null, 114);
      }

      int var7 = de.a((int)0, var1) << var4;
      int var8 = fh.a(var1, false);
      int var9 = 1 + 2 * var8;
      var3[0] = new short[var9];
      if(var2 > -33) {
         b = (Object[])null;
      }

      int var10;
      for(var10 = 0; ((short[])((short[])var3[0])).length > var10; ++var10) {
         short var11 = (short)de.a((int)0, var1);
         int var12 = var11 >>> 8;
         if(var12 >= var9) {
            var12 = -1 + var9;
         }

         int var13 = var11 & 255;
         if(-var12 + var9 < var13) {
            var13 = -var12 + var9;
         }

         ((short[])((short[])var3[0]))[var10] = (short)(var13 | var12 << 8);
      }

      var8 = iba.b + (var8 << qqa.e);
      var10 = tpa.f == null?en.c['\uffff' & spa.a(de.a((int)0, var1), (byte)68)]:tpa.f[de.a((int)0, var1)];
      int var14 = fh.a(var1, false);
      ((int[])((int[])var3[1]))[2] = 31 & var14;
      ((int[])((int[])var3[1]))[4] = (224 & var14) << 3;
      if(-32 != ~((int[])((int[])var3[1]))[2]) {
         gl.a(var3, -1527);
      }

      var3[3] = var0.a(var5, var7, var6, var8, var10, 1.0F);
      return var3;
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12);

   abstract aa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   final void a(byte var1, int var2, int var3, int var4, int var5) {
      ++J;
      int var6 = 72 % ((-64 - var1) / 35);
      this.HA(var2, var4, var5, var3, 1);
   }

   abstract cga a(int var1, int var2, boolean var3, boolean var4);

   abstract Object[] c(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract boolean r();

   abstract boolean n();

   abstract void b(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract void c(float var1, float var2, float var3, float[] var4);

   abstract boolean j();

   abstract Object[] h();

   abstract void a(int var1, int var2, int var3, int var4);

   final void a(boolean var1, hsa var2) {
      try {
         ++o;
         if(-1 >= ~this.g && var2 == this.C[this.g]) {
            this.C[this.g--] = null;
            var2.b();
            if(0 > this.g) {
               this.E = this.m;
               this.m.a();
            } else {
               this.E = this.C[this.g];
               this.C[this.g].a();
            }

            if(!var1) {
               this.m = (gv)null;
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "ta.RD(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   abstract Object[] a(Object[] var1, Object[] var2, float var3, Object[] var4);

   protected void finalize() {
      this.a((byte)17);
      ++h;
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9);

   abstract void p(int var1, int var2, int var3);

   final void d(int var1, int var2, int var3, int var4, int var5, int var6) {
      ++d;
      this.r(var4, var2, var3, var1, var5, 1);
      if(var6 != 14851) {
         this.a(96, -120, -9, -28, ((int[])((int[])b[9]))[1], -104, ((int[])((int[])b[5]))[1], 7, 125);
      }

   }

   abstract void TA(int[] var1);

   abstract void c(int var1, int var2) throws cr;

   abstract void T(int var1, int var2, int var3, int var4, int var5);

   abstract Object[] c();

   abstract boolean d();

   abstract void UA(float var1, float var2);

   abstract void a(boolean var1);

   final void a(int var1, Canvas var2, int var3, int var4) {
      ++v;
      if(!this.y.containsKey(var2)) {
         rca.a(39, var2);
         this.a(var2, this.a(var2, var1, var3), 8);
      }

      if(var4 > -125) {
         this.a((Canvas)null, -91);
      }

   }

   abstract Object[] k();

   abstract int[] Y(int var1, int var2, int var3, int var4);

   abstract void a(int var1, Object[] var2);

   abstract ka a(ii var1, int var2, int var3, int var4, int var5);

   abstract void a(Object[] var1);

   abstract cga a(aea var1, boolean var2);

   abstract za a(int var1);

   abstract void r(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract void B();

   final cga a(int var1, int var2, int var3, int[] var4, int var5, int var6) {
      if(var2 != -7343) {
         ((long[])((long[])b[16]))[5] = 94L;
      }

      ++a;
      return this.a(var4, var3, var1, var6, var5, true);
   }

   abstract boolean o();

   abstract void b(int var1);

   final void a(Canvas var1, int var2) {
      try {
         if(var2 <= -122) {
            ++f_l;
            gv var3 = (gv)this.y.get(var1);
            if(null != var3) {
               if(0 >= this.g && this.m == this.E) {
                  if(this.E != null) {
                     this.E.b();
                  }

                  this.m = var3;
                  if(-1 < ~this.g) {
                     this.E = var3;
                  }

                  var3.a();
               } else {
                  throw new RuntimeException();
               }
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "ta.PD(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   abstract void C();

   abstract void j(int var1);

   final void a(byte var1) {
      ++e;
      wh.c[this.G] = false;
      Enumeration var2 = this.y.keys();
      if(var1 != 17) {
         this.y = (Hashtable)null;
      }

      while(var2.hasMoreElements()) {
         Canvas var3 = (Canvas)var2.nextElement();
         gv var4 = (gv)this.y.get(var3);
         var4.c();
      }

      this.C();
   }

   abstract void i();

   abstract void c(boolean var1);

   abstract void h(int var1);

   abstract void b();

   final void a(hsa var1, int var2) {
      try {
         ++n;
         if(this.g < 3) {
            if(0 <= this.g) {
               this.C[this.g].b();
            } else {
               this.m.b();
            }

            this.E = this.C[++this.g] = var1;
            if(var2 == 59) {
               var1.a();
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "ta.HE(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   abstract void b(int var1, Object[] var2);

   abstract void b(Object[] var1);

   abstract void b(int var1, int var2, int var3, int var4);

   abstract boolean z();

   abstract void d(int var1);

   abstract void c(int var1);

   abstract void c(Object[] var1);

   abstract Class_s a(int var1, int var2, int[] var3, int[] var4);

   abstract int XA();

   final void a(int var1, int var2, int var3, int var4, byte var5) {
      this.T(var2, var3, var4, var1, 1);
      ++x;
      int var6 = -103 % ((var5 - 7) / 47);
   }

   abstract void FA(int var1, float var2, float var3, float var4, float var5, float var6);

   static final int a(Object[] var0, int var1) {
      if(var1 != 6) {
         return -7;
      } else {
         ++f_i;
         return ((int[])((int[])var0[12]))[6];
      }
   }

   final void f(int var1) throws cr {
      this.c(0, 0);
      ++H;
      int var2 = 95 % ((var1 + 10) / 49);
   }

   final void a(int var1, byte var2, int var3, int var4, int var5, int var6) {
      if(var2 != -121) {
         this.g = ((int[])((int[])b[0]))[13];
      }

      ++z;
      this.b(var6, var1, var4, var5, var3, 1);
   }

   final ue e(int var1) {
      if(var1 != 30626) {
         return (ue)b[7];
      } else {
         ++c;
         return this.E;
      }
   }

   abstract boolean g();

   abstract void a(float var1, float var2, float var3, float var4, float var5, float var6);

   final void a(float var1, float var2, float var3, byte var4) {
      ++D;
      if(var4 <= -107) {
         this.a(var2, var3, var1, 0.0F, 1.0F, 1.0F);
      }
   }

   abstract void S(int var1, int var2, int var3, int var4, int var5);

   abstract boolean w();

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void e();

   abstract void g(int var1, int var2);

   final void a(int var1, Canvas var2, int var3, boolean var4) {
      try {
         if(var4) {
            ++f;
            gv var5 = (gv)this.y.get(var2);
            if(var5 != null) {
               var5.b(var3, var1);
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var6) {
         throw vt.a(var6, "ta.SD(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   abstract void a(za var1);

   abstract cga a(int var1, int var2, int var3, int var4, boolean var5);

   abstract boolean q();

   abstract void b(float var1, float var2, float var3, float[] var4);

   abstract int x();

   final gv i(int var1) {
      if(var1 != -26586) {
         this.g(-21, 11);
      }

      ++A;
      return this.m;
   }

   abstract re b(int var1, int var2);

   abstract lua e(int var1, int var2);

   final void a(Canvas var1, gv var2, int var3) {
      try {
         ++w;
         if(var2 == null) {
            throw new RuntimeException();
         } else {
            this.y.put(var1, var2);
            if(var3 != 8) {
               this.y = (Hashtable)b[8];
            }

         }
      } catch (RuntimeException var5) {
         throw vt.a(var5, "ta.QD(" + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   abstract void s();

   abstract void b(boolean var1);

   abstract int d(int var1, int var2);

   abstract void PA(int[] var1);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   final cga a(int var1, int var2, int var3, boolean var4) {
      ++r;
      if(var1 < 33) {
         this.a((byte)-61, -2, -97, ((int[])((int[])b[15]))[5], (int)47);
      }

      return this.a(var3, var2, var4, false);
   }

   abstract void a(float var1, float var2, float var3, float[] var4);

   abstract boolean y();

   abstract void HA(int var1, int var2, int var3, int var4, int var5);

   static final void a(String var0, String var1, boolean var2, int var3, boolean var4) {
      if(!var4) {
         ce.a = -1;
      }

      tba.c = var0;
      la.f_l = var4;
      bm.f = var1;
      ++B;
      sn.g = var2;
      if(!la.f_l && (tba.c.equals("") || bm.f.equals(""))) {
         ul.a(3, (byte)7);
      } else {
         ((boolean[])((boolean[])kv.e[11]))[0] = false;
         if(var3 < 50) {
            a(-18, 51, (qa)b[7], ((int[])((int[])b[0]))[2], 100, (Canvas)null, ((int[])((int[])b[4]))[13], (Object[])null);
         }

         if(ww.r != 162) {
            ufa.b = 0;
            dl.e = -1;
            vt.e = -1;
         }

         ul.a(-3, (byte)7);
         to.a = 17;
         uk.b = 0;
         bia.g = 0;
      }
   }

   abstract Object[] v();

   abstract void a(int var1, Object[][] var2);

   ta(qa var1) {
      this.k = var1;
      int var2 = -1;

      for(int var3 = 0; var3 < 8; ++var3) {
         if(!wh.c[var3]) {
            var2 = var3;
            wh.c[var3] = true;
            break;
         }
      }

      if(-1 == var2) {
         throw new IllegalStateException("");
      } else {
         this.G = var2;
      }
   }

   void a(int[] var1) {
      ++t;
      if(null == this.m) {
         var1[1] = 0;
         var1[0] = 0;
      } else {
         var1[0] = this.m.e();
         var1[1] = this.m.d();
      }

   }

   abstract void ka(float var1);

   abstract int a(int var1, int var2);

   abstract gv a(Canvas var1, int var2, int var3);

}
