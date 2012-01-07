import jaggl.OpenGL;

final class pta {

   static int c;
   static int f;
   static int e;
   static int b;
   static int d;
   static int a;


   static final boolean a(byte var0, char var1) {
      ++a;
      return var0 < 38?true:65 <= var1 && 90 >= var1 || 97 <= var1 && var1 <= 122;
   }

   static final boolean a(int var0, Object[] var1) {
      ++e;
      if(((boolean[])((boolean[])var1[9]))[0]) {
         return true;
      } else {
         ((int[])((int[])var1[4]))[2] = dra.a('\u8b31', (String)var1[7], (String)var1[1], var0 ^ -29814, var1);
         ((int[])((int[])var1[4]))[0] = dra.a('\u8b30', (String)var1[6], (String)var1[2], 102, var1);
         if(((int[])((int[])var1[4]))[2] != 0 && 0 != ((int[])((int[])var1[4]))[0]) {
            ((int[])((int[])var1[4]))[1] = OpenGL.glCreateProgram();
            if(((int[])((int[])var1[4]))[2] != 0) {
               OpenGL.glAttachShader(((int[])((int[])var1[4]))[1], ((int[])((int[])var1[4]))[2]);
            }

            if(((int[])((int[])var1[4]))[0] != 0) {
               OpenGL.glAttachShader(((int[])((int[])var1[4]))[1], ((int[])((int[])var1[4]))[0]);
            }

            OpenGL.glLinkProgram(((int[])((int[])var1[4]))[1]);
            OpenGL.glGetProgramiv(((int[])((int[])var1[4]))[1], '\u8b82', lp.g, 0);
            if(lp.g[0] == 0) {
               if(((int[])((int[])var1[4]))[2] != 0) {
                  OpenGL.glDetachShader(((int[])((int[])var1[4]))[1], ((int[])((int[])var1[4]))[2]);
                  OpenGL.glDeleteShader(((int[])((int[])var1[4]))[2]);
               }

               if(-1 != ~((int[])((int[])var1[4]))[0]) {
                  OpenGL.glDetachShader(((int[])((int[])var1[4]))[1], ((int[])((int[])var1[4]))[0]);
                  OpenGL.glDeleteShader(((int[])((int[])var1[4]))[0]);
               }

               OpenGL.glDeleteProgram(((int[])((int[])var1[4]))[1]);
               return false;
            } else {
               OpenGL.glUseProgram(((int[])((int[])var1[4]))[1]);
               int var2 = -1;

               int var3;
               for(var3 = 0; var3 < qsa.a((byte)-9, (Object[])((Object[])var1[12])); ++var3) {
                  if(var1 == sm.a(3, var3, (Object[])((Object[])var1[12]))) {
                     var2 = var3;
                     break;
                  }
               }

               if(-1 == var2) {
                  return false;
               } else {
                  var3 = 0;
                  if(var0 != -29708) {
                     f = ((int[])((int[])var1[21]))[0];
                  }

                  int var4 = 0;
                  int var5 = 0;

                  while(true) {
                     Object[] var8 = (Object[])((Object[])var1[12]);
                     int var7 = ((int[])((int[])var8[1]))[1];
                     if(var5 >= var7) {
                        for(var5 = 0; var5 < nla.a((byte)122, (Object[])((Object[])var1[12])); ++var5) {
                           Object[] var6 = vfa.a((Object[])((Object[])var1[12]), false, var5);
                           if(var6 != null) {
                              jq.a(var6, var2, 1);
                              Object[] var14 = eva.b(-57, var6);
                              int var15 = ((int[])((int[])var6[7]))[var2];
                              if(qla.a != var14 && aqa.m != var14 && var14 != us.a && pc.a != var14 && hja.c != var14) {
                                 var4 = Math.max(var15, var4);
                              } else {
                                 var3 = Math.max(var15, var3);
                              }
                           }
                        }

                        var1[5] = new float[var3 + 1];
                        var1[14] = new float[1 + var3];
                        var1[11] = new float[var3 + 1];
                        var1[8] = new float[1 + var3];
                        var1[10] = new int[var4 + 1];

                        for(var5 = 0; ~var5 > ~((int[])((int[])var1[10])).length; ++var5) {
                           ((int[])((int[])var1[10]))[var5] = -1;
                        }

                        var1[6] = null;
                        var1[7] = null;
                        ((boolean[])((boolean[])var1[9]))[0] = true;
                        return true;
                     }

                     Object[] var10 = (Object[])((Object[])var1[12]);
                     Object[] var9 = vi.a((Object[])((Object[])var10[5]), true, var5);
                     if(null != var9) {
                        jq.a(var9, var2, var0 + 29709);
                        Object[] var12 = eva.b(-87, var9);
                        int var13 = ((int[])((int[])var9[7]))[var2];
                        if(qla.a != var12 && var12 != aqa.m && var12 != us.a && var12 != pc.a && var12 != hja.c) {
                           var4 = Math.max(var13, var4);
                        } else {
                           var3 = Math.max(var13, var3);
                        }
                     }

                     ++var5;
                  }
               }
            }
         } else {
            if(((int[])((int[])var1[4]))[2] != 0) {
               OpenGL.glDeleteShader(((int[])((int[])var1[4]))[2]);
            }

            if(((int[])((int[])var1[4]))[0] != 0) {
               OpenGL.glDeleteShader(((int[])((int[])var1[4]))[0]);
            }

            return false;
         }
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++c;
      int var4 = var2 * ((int[])((int[])var3[0]))[3] >> 12;
      int var5 = var2 * ((int[])((int[])var3[0]))[6] >> 12;
      int var6 = var1 * ((int[])((int[])var3[0]))[5] >> 12;
      int var7 = var1 * ((int[])((int[])var3[0]))[4] >> 12;
      ada.a(((int[])((int[])var3[0]))[1], var5, 3, var4, ((int[])((int[])var3[0]))[0], var6, var7, ((int[])((int[])var3[0]))[2]);
      if(var0 >= 0) {
         a(((int[])((int[])var3[9]))[1], ((int[])((int[])((Object[])((Object[])var3[2]))[3]))[1], -33, (Object[])null);
      }

   }

   static final void a(Object[] var0, boolean var1) {
      if(var1) {
         a(2, ((int[])((int[])var0[10]))[4], -27, (Object[])((Object[])var0[4]));
      }

      if(var0 != null && -44 == ~var0.length && 8 == ((byte[])((byte[])var0[10])).length) {
         if(null != var0[42]) {
            lj.a(8, ((byte[])((byte[])var0[10]))[0] != ((byte[])((byte[])uta.g[10]))[0], var0);
         }
      } else if(null != var0 && 43 == var0.length && -59 == ~((int[])((int[])var0[12])).length) {
         uma.a(var0, ((byte[])((byte[])uta.g[10]))[0] != ((byte[])((byte[])var0[10]))[0], (byte)-110);
      }

      ++b;
   }

}
