import jaggl.OpenGL;

final class hr {

   static int a;
   static int c;
   static int b;
   static int d;


   static final Object[] a(int var0, int var1, Object[] var2) {
      ++a;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[var1]), (long)var0));
      }

      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         synchronized(var2[2]) {
            var4 = qn.a(19, var0, (Object[])((Object[])var2[2]), 81);
         }

         var3 = hna.a(new Object[2], var1 - 120);
         if(var4 != null) {
            Object[] var5 = jta.a((byte)-84, var4, new Object[3]);
            if(null != var2 && var2.length == 7) {
               mo.b((Object[])null, -1511823029);
            }

            while(true) {
               int var6 = fh.a(var5, false);
               if(0 == var6) {
                  break;
               }

               wha.a(var3, var5, var6, var1 - 109);
            }
         }

         synchronized(var2[0]) {
            il.a((long)var0, var3, true, (Object[])((Object[])var2[0]));
            return var3;
         }
      }
   }

   static final void a(ja var0) {
      fo.e = var0;
   }

   static final void a(int var0, byte[] var1, boolean var2, byte var3, Object[] var4, int var5, int var6, Object[] var7, int var8, int var9, int var10) {
      ++d;
      if(var3 == 94) {
         if(var6 == 0) {
            var6 = var0;
         }

         if(var2) {
            int var11 = ((int[])((int[])var4[0]))[0];
            int var12 = var11 * var0;
            int var13 = var11 * var6;
            byte[] var14 = new byte[var9 * var12];
            if(var4 != null && -3 == ~var4.length && var4[1].equals(Integer.valueOf(1))) {
               rs.a(34, var3 + 10930, (Object[])null);
            }

            int var15 = 0;

            while(true) {
               if(var15 >= var9) {
                  var1 = var14;
                  break;
               }

               int var16 = var12 * var15;
               if(null != var4 && (-6 == ~var4.length && var4[0].equals(Integer.valueOf(1)) || var4.length == 3)) {
                  return;
               }

               int var17 = (-1 + -var15 + var9) * var13 + var8;

               for(int var18 = 0; var18 < var12; ++var18) {
                  var14[var16++] = var1[var17++];
               }

               ++var15;
            }
         }

         moa.a((byte)111, var7, (Object[])((Object[])var7[4]));
         OpenGL.glPixelStorei(3317, 1);
         if(var0 != var6) {
            OpenGL.glPixelStorei(3314, var6);
         }

         OpenGL.glTexSubImage2Dub(((int[])((int[])var7[1]))[2], 0, var5, -var10 + ((int[])((int[])var7[1]))[4] + -var9, var0, var9, rha.b(8, var4), 5121, var1, var8);
         if(var6 != var0) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      }
   }

   static final void a(Object[] var0, int var1) {
      ++c;
      int var2 = (((int[])((int[])var0[12]))[28] - 1 << 8) + 240;
      Object[] var3 = (Object[])((Object[])woa.a(var1 ^ 21352, var0)[1]);
      ((short[])((short[])var0[13]))[0] = (short)((int)((float[])((float[])var3[1]))[2] + var2 >> 9);
      ((short[])((short[])var0[13]))[2] = (short)((int)((float[])((float[])var3[1]))[1] + var2 >> 9);
      ((short[])((short[])var0[13]))[1] = (short)((int)((float[])((float[])var3[1]))[2] - var2 >> 9);
      ((short[])((short[])var0[13]))[3] = (short)(-var2 + (int)((float[])((float[])var3[1]))[1] >> 9);
      if(var1 == 21357) {
         ;
      }
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2) {
      ++b;
      int var3 = fh.a(var0, false);
      if(null != var2 && var2.length == 10) {
         tk.a((String)fr.g[0], (byte)117, ((int[])((int[])Class_ls.m[6]))[0], (Object[])null);
      }

      if(var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];
         if(var1 > -1) {
            ((int[])((int[])var2[4]))[17] = 106;
         }

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = fh.a(var0, false);
            if(var6 != 0) {
               if(1 == var6) {
                  var4[var5] = ara.b((byte)61, var0);
               }
            } else {
               var4[var5] = new Integer(lr.a(1, var0));
            }
         }

         ((boolean[])((boolean[])var2[5]))[17] = true;
         return var4;
      }
   }

}
