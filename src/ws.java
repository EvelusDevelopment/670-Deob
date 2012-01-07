import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class ws extends kp {

   static int s;
   static int y;
   private Object[] v;
   static int x;
   static int t;
   static int w;
   static int p;
   static Object[] z = sd.a(new Object[1], 97, (byte)116);
   static int r;
   static int B;
   static int C;
   static int D;
   static int q;
   static Object[] n = ho.a(3, 65, new Object[1], true);
   static int o;
   static cga A;
   static int[] u = new int[1];


   static final Object[] a(int var0, int var1, int var2) {
      if(ju.g[var0][var1][var2] == null) {
         boolean var3 = ju.g[0][var1][var2] != null && ju.g[0][var1][var2][9] != null;
         if(var3 && var0 >= ri.n - 1) {
            return null;
         }

         ooa.b(var0, var1, var2);
      }

      return ju.g[var0][var1][var2];
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++B;
      if(var0 >= -82) {
         u = (int[])null;
      }

      if(null != var2[43]) {
         mr.a((Object[])((Object[])var2[43]), (byte)-78);
      }

      ((int[])((int[])var2[1]))[28] = var1 & Integer.MAX_VALUE;
   }

   ws(Object[] var1) {
      this.v = var1;
   }

   final int d() {
      ++w;
      byte var1 = 1;
      return var1;
   }

   static final void a(Object[] var0, int var1, Object[] var2, boolean var3, int var4, byte var5, int var6, ta var7) {
      if(var5 == -90) {
         ++D;
         throw new IllegalStateException();
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++s;
      if(var0 != 1) {
         ((long[])((long[])((Object[])((Object[])n[3]))[2]))[5] = -5L;
      }

      return false;
   }

   static final void a(Object[] var0, int var1) {
      IDirect3DDevice.SetScissorRect(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[36] + ((int[])((int[])var0[1]))[16], ((int[])((int[])var0[1]))[0] + ((int[])((int[])var0[1]))[1], ((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[26]);
      ++x;
      if(var1 >= -47) {
         a((Object[])null, -17);
      }

   }

   static final void b(Object[] var0, int var1) {
      var0[2] = new Object[((int[])((int[])var0[1]))[1]][((int[])((int[])var0[1]))[2]][];
      ++p;
      if(null == var0 || var0.length != 27 || !var0[14].equals(Integer.valueOf(2))) {
         for(int var2 = 0; ((int[])((int[])var0[1]))[2] > var2; ++var2) {
            for(int var3 = 0; ((int[])((int[])var0[1]))[1] > var3; ++var3) {
               ((Object[][][])((Object[][][])var0[2]))[var3][var2] = wq.a((Object[])((Object[])var0[4]), var0, (Object[])((Object[])var0[3]), 128 * var3 + 1, ((int[])((int[])var0[1]))[4], (byte)46, 1 + 128 * var2, new Object[7], var3, var2);
            }

            if(var0 != null && 7 == var0.length && var0[1].equals(Integer.valueOf(1))) {
               return;
            }
         }

         if(var1 != 128) {
            ((byte[])((byte[])((Object[])((Object[])n[0]))[3]))[1] = 0;
         }

      }
   }

   final kp a() {
      ++C;
      Object var1 = null;
      return (kp)var1;
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++t;
      if(null != var2 && var2.length == 87) {
         hk.a(var1, 81, var2);
      } else if(var2 != null && 91 == var2.length) {
         Object[][] var3 = (Object[][])((Object[][])var1[0]);
         if(var2 != null && -10 == ~var2.length && var2[0].equals(Integer.valueOf(2))) {
            hsa.a((Object[])null, -2375);
         }

         int var4 = 0;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;

         int var8;
         for(var8 = 0; ~var8 > ~var3.length; ++var8) {
            Object[] var9 = var3[var8];
            Object[] var10 = ((Object[][])((Object[][])var2[88]))[var8];
            if(var2 != null && (-2 == ~var2.length || var2.length == 27)) {
               mua.a((Object[])null, (byte)-61);
            }

            int var11 = 0;
            byte var12 = ((byte[])((byte[])var10[5]))[0];
            byte var13 = var12;
            long var14 = dj.a(var10, (int)1);
            if(((boolean[])((boolean[])((Object[])((Object[])var10[3]))[63]))[24]) {
               OpenGL.glBindBufferARB(((int[])((int[])var10[1]))[0], ((int[])((int[])var10[1]))[3]);
            }

            for(int var16 = 0; ~var16 > ~vt.a((byte)95, var9); ++var16) {
               Object[] var17 = wo.a(var16, var9, -22081);
               if(var17 != eba.a) {
                  if(var17 == eba.h) {
                     OpenGL.glNormalPointer(5126, var13, var14 - -((long)var11));
                     var6 = true;
                  } else if(var17 == eba.d) {
                     var5 = true;
                     OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var11);
                  } else if(var17 != eba.k) {
                     if(var17 != eba.e) {
                        if(var17 != eba.m) {
                           if(eba.c == var17) {
                              OpenGL.glClientActiveTexture('\u84c0' + var4++);
                              OpenGL.glTexCoordPointer(4, 5126, var13, var14 - -((long)var11));
                           }
                        } else {
                           OpenGL.glClientActiveTexture('\u84c0' + var4++);
                           OpenGL.glTexCoordPointer(3, 5126, var13, var14 - -((long)var11));
                        }
                     } else {
                        OpenGL.glClientActiveTexture(var4++ + '\u84c0');
                        OpenGL.glTexCoordPointer(2, 5126, var13, (long)var11 + var14);
                     }
                  } else {
                     OpenGL.glClientActiveTexture('\u84c0' + var4++);
                     OpenGL.glTexCoordPointer(1, 5126, var13, (long)var11 + var14);
                  }
               } else {
                  var7 = true;
                  OpenGL.glVertexPointer(3, 5126, var13, var14 + (long)var11);
               }

               var11 += ((int[])((int[])var17[1]))[2];
            }
         }

         if(!var7 != !((boolean[])((boolean[])var2[63]))[28]) {
            if(!var7) {
               OpenGL.glDisableClientState('\u8074');
            } else {
               OpenGL.glEnableClientState('\u8074');
            }

            ((boolean[])((boolean[])var2[63]))[28] = var7;
         }

         if(((boolean[])((boolean[])var2[63]))[25] == !var6) {
            if(var6) {
               OpenGL.glEnableClientState('\u8075');
            } else {
               OpenGL.glDisableClientState('\u8075');
            }

            ((boolean[])((boolean[])var2[63]))[25] = var6;
         }

         if(var5 != ((boolean[])((boolean[])var2[63]))[22]) {
            if(var5) {
               OpenGL.glEnableClientState('\u8076');
            } else {
               OpenGL.glDisableClientState('\u8076');
            }

            ((boolean[])((boolean[])var2[63]))[22] = var5;
         }

         if(var4 > ((int[])((int[])var2[1]))[41]) {
            for(var8 = ((int[])((int[])var2[1]))[41]; var4 > var8; ++var8) {
               OpenGL.glClientActiveTexture('\u84c0' + var8);
               OpenGL.glEnableClientState('\u8078');
            }

            ((int[])((int[])var2[1]))[41] = var4;
            if(null != var1 && var1.length == 16) {
               oa.a((Object[])null, (Object[])null, (byte)-72, (Object[])((Object[])((Object[])((Object[])ota.z[8]))[2]));
            }
         } else if(var4 < ((int[])((int[])var2[1]))[41]) {
            if(var1 != null && (14 == var1.length || 9 == var1.length)) {
               ((byte[])((byte[])ota.z[13]))[4] = -25;
            }

            for(var8 = var4; ((int[])((int[])var2[1]))[41] > var8; ++var8) {
               OpenGL.glClientActiveTexture(var8 + '\u84c0');
               OpenGL.glDisableClientState('\u8078');
            }

            ((int[])((int[])var2[1]))[41] = var4;
         }

      } else if(var0 >= 92) {
         throw new IllegalStateException();
      }
   }

   final kp b() {
      ++q;
      Object var1 = null;
      return (kp)var1;
   }

   final void b(int[] var1, int var2, int var3) {
      ++r;
      et.a(1, var1, var3, var2, this.v);
   }

   final void a(int var1) {
      ++y;
      Object[] var2 = this.v;
      int var3 = var1;
      synchronized(var2) {
         if(!((boolean[])((boolean[])var2[3]))[0]) {
            if(null != var2 && (-3 == ~var2.length || var2.length == 2)) {
               return;
            }

            while(true) {
               Object[] var5 = mb.a(var2, 6);
               if(var5 == null) {
                  if(((boolean[])((boolean[])var2[3]))[1]) {
                     ((lm)var2[2]).a((byte)122);
                     wi.a(sl.a, (byte)65);
                  }
                  break;
               }

               if(((short[][])((short[][])var5[1]))[0].length + -((int[])((int[])var2[1]))[4] > var3) {
                  ((int[])((int[])var2[1]))[4] += var3;
                  break;
               }

               var3 -= ((short[][])((short[][])var5[1]))[0].length - ((int[])((int[])var2[1]))[4];
               epa.a(var2, -106);
            }
         }

      }
   }

}
