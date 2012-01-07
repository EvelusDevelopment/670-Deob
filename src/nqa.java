import jaggl.OpenGL;

final class nqa implements Runnable {

   static int b;
   static int g;
   static int f_i;
   static Object[] d;
   static int c;
   static int a;
   private Object[] h;
   static int e;
   static int f;


   nqa(Object[] var1) {
      this.h = var1;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 == 41) {
         ++f;
         ((boolean[])((boolean[])var0[8]))[6] = true;
      }
   }

   static final int a(int var0, Object[] var1) {
      int var2 = -111 / ((var0 - 70) / 46);
      ++f_i;
      ((int[])((int[])var1[1]))[0] += 2;
      return (255 & ((byte[])((byte[])var1[2]))[-2 + ((int[])((int[])var1[1]))[0]]) + (((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 1] << 8 & '\uff00');
   }

   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3, Object[] var4) {
      ++g;
      if(var4[1] == null) {
         var4[1] = new int[1];
      }

      ina.a(64, var4);
      if(var1 != 1) {
         a((Object[])null, (Object[])null, 20, (Object[])null, (Object[])null, (Object[])null);
      }

      var4[0] = var0;
      if(var4[0] != null) {
         ((int[])((int[])var4[1]))[0] = jla.a((Object[])((Object[])var4[0]), (byte)39, 16);
         if(client.f_vb == 0) {
            return var4;
         }
      }

      ((int[])((int[])var4[1]))[0] = 0;
      return var4;
   }

   static final void a(Object[] var0, byte var1, int var2) {
      synchronized(var0) {
         ((int[])((int[])var0[1]))[4] = var2;
         int var4 = -60 % ((var1 + 33) / 45);
      }

      ++c;
   }

   public final void run() {
      ++a;
      aoa.a((byte)109, this.h);
   }

   static final void a(Object[] var0, Object[] var1, int var2, Object[] var3, Object[] var4, Object[] var5) {
      ++e;
      if(var2 == 20798) {
         if(var0 == null) {
            OpenGL.glDisableClientState('\u8074');
         } else {
            vf.a((Object[])((Object[])var0[2]), var4, 5);
            OpenGL.glVertexPointer(((byte[])((byte[])var0[1]))[0], ((short[])((short[])var0[0]))[0], pua.a((byte)118, (Object[])((Object[])var4[44])), pka.a((byte)17, (Object[])((Object[])var4[44])) + (long)((byte[])((byte[])var0[1]))[1]);
            OpenGL.glEnableClientState('\u8074');
         }

         if(var1 == null) {
            OpenGL.glDisableClientState('\u8075');
         } else {
            vf.a((Object[])((Object[])var1[2]), var4, var2 - 20793);
            OpenGL.glNormalPointer(((short[])((short[])var1[0]))[0], pua.a((byte)120, (Object[])((Object[])var4[44])), pka.a((byte)17, (Object[])((Object[])var4[44])) + (long)((byte[])((byte[])var1[1]))[1]);
            OpenGL.glEnableClientState('\u8075');
         }

         if(var5 == null) {
            OpenGL.glDisableClientState('\u8076');
         } else {
            vf.a((Object[])((Object[])var5[2]), var4, 5);
            OpenGL.glColorPointer(((byte[])((byte[])var5[1]))[0], ((short[])((short[])var5[0]))[0], pua.a((byte)125, (Object[])((Object[])var4[44])), pka.a((byte)17, (Object[])((Object[])var4[44])) - -((long)((byte[])((byte[])var5[1]))[1]));
            OpenGL.glEnableClientState('\u8076');
         }

         if(null != var3) {
            vf.a((Object[])((Object[])var3[2]), var4, var2 - 20793);
            OpenGL.glTexCoordPointer(((byte[])((byte[])var3[1]))[0], ((short[])((short[])var3[0]))[0], pua.a((byte)118, (Object[])((Object[])var4[44])), pka.a((byte)17, (Object[])((Object[])var4[44])) + (long)((byte[])((byte[])var3[1]))[1]);
            OpenGL.glEnableClientState('\u8078');
         } else {
            OpenGL.glDisableClientState('\u8078');
         }

      }
   }

   static final Object[][] b(Object[] var0, byte var1) {
      ++b;
      if(null != var0[0]) {
         return (Object[][])((Object[][])var0[0]);
      } else if(null == var0[8]) {
         return (Object[][])null;
      } else {
         var0[0] = new Object[((Object[])((Object[])var0[8])).length][];
         if(var1 > -89) {
            d = (Object[])null;
         }

         for(int var2 = 0; ((Object[])((Object[])var0[8])).length > var2; ++var2) {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            if(((int[][])((int[][])var0[8]))[var2] != null) {
               var5 = ((int[][])((int[][])var0[8]))[var2][2];
               var7 = ((int[][])((int[][])var0[8]))[var2][4] << 3;
               var3 = ((int[][])((int[][])var0[8]))[var2][0];
               var8 = ((int[][])((int[][])var0[8]))[var2][5] << 3;
               var6 = ((int[][])((int[][])var0[8]))[var2][3] << 3;
               var4 = ((int[][])((int[][])var0[8]))[var2][1];
            }

            if(0 != var3 || 0 != var4 || 0 != var5 || var6 != 0 || var7 != 0 || var8 != 0) {
               Object[] var9 = ((Object[][])((Object[][])var0[0]))[var2] = im.a(new Object[2], (int)-16365);
               if(0 != var8) {
                  ha.a(1.0F, 0.0F, var9, 24515, mw.a(var8, (byte)43), 0.0F);
               }

               if(var6 != 0) {
                  ha.a(0.0F, 0.0F, var9, 24515, mw.a(var6, (byte)75), 1.0F);
               }

               if(0 != var7) {
                  ha.a(0.0F, 1.0F, var9, 24515, mw.a(var7, (byte)34), 0.0F);
               }

               if(null != var9 && (var9.length == 3 || 9 == var9.length && var9[3].equals(Boolean.valueOf(false)))) {
                  cp.a((Object[])null, -127);
               }

               cq.a((byte)81, (float)var3, (float)var4, (float)var5, var9);
            }
         }

         return (Object[][])((Object[][])var0[0]);
      }
   }

}
