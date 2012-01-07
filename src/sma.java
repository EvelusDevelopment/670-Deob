
final class sma {

   static int b;
   static Object[] a = sl.a("8", 0, new Object[1], "8");
   static int f_i;
   static int c;
   static int g;
   static int d;
   static int e;
   static float h = 0.0F;
   static Object[] f = ed.a(7, new Object[1], (byte)-98, 94);
   static float j;


   static final void b(int var0, Object[] var1) {
      ++f_i;
      ((float[])((float[])var1[34]))[0] = 2.4414062E-4F;
      short var2 = 256;
      float var3 = 0.3F;
      float var4 = 0.4F;
      float var5 = 0.1F;
      vt.a(((float[])((float[])var1[34]))[0], (byte)126, (Object[])((Object[])var1[29]), ((float[])((float[])var1[34]))[0], ((float[])((float[])var1[34]))[0], ((float[])((float[])var1[34]))[0]);
      byte var6 = 5;
      aha.a(-((float[])((float[])((Object[])((Object[])var1[0]))[53]))[1], 32.0F, -((float[])((float[])((Object[])((Object[])var1[0]))[53]))[0], -((float[])((float[])((Object[])((Object[])var1[0]))[53]))[2], (Object[])((Object[])var1[26]), (byte)-74);
      aha.a(((float[])((float[])((Object[])((Object[])var1[0]))[0]))[2], (float)var6, ((float[])((float[])((Object[])((Object[])var1[0]))[var0]))[11], ((float[])((float[])((Object[])((Object[])var1[0]))[0]))[3], (Object[])((Object[])var1[37]), (byte)-74);
      aha.a(var4, var3, var5, (float)var2, (Object[])((Object[])var1[35]), (byte)-74);
   }

   static final void a(boolean var0, int var1, Object[] var2) {
      ++d;
      efa.a((Object[])((Object[])var2[3]), '\u0000', var1 ^ var1);
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[5]))[0]) {
         nha.a((Object[])((Object[])var2[0]), 18806, 1);
         moa.a((byte)102, (Object[])((Object[])((Object[])((Object[])var2[4]))[1]), (Object[])((Object[])var2[0]));
         nha.a((Object[])((Object[])var2[0]), 18806, 0);
      }

   }

   static final Object[] a(int var0, Object[] var1) {
      ++c;
      return var0 != 1?(Object[])((Object[])f[0]):uj.a[((int[])((int[])var1[0]))[1]];
   }

   static final String a(Object[] var0, byte var1, int var2) {
      ++g;

      try {
         int var3 = tga.a((int)1, var0);
         if(var3 > var2) {
            var3 = var2;
         }

         byte[] var4 = new byte[var3];
         int[] var5;
         int[] var7 = var5 = (int[])((int[])var0[1]);
         byte var6 = 0;
         byte var8 = 0;
         int var9 = var5[var6];
         Object[] var11 = qca.b;
         byte[] var12 = (byte[])((byte[])var0[2]);
         int var13 = ((int[])((int[])var0[1]))[0];
         byte[] var14 = var4;
         if(var0 != null && (var0.length == 7 || 15 == var0.length)) {
            a(new Object[0][], (byte)100, ((int[])((int[])qca.b[0]))[6]);
         }

         int var15 = 0;
         if(null != var11 && var11.length == 18 && var11[7].equals(Integer.valueOf(2)) && var11[7].equals(Integer.valueOf(1))) {
            qca.b = (Object[])((Object[])qca.b[1]);
         }

         int var10;
         if(var3 == 0) {
            var10 = 0;
         } else {
            int var17 = 0;
            int var16 = var3 + var15;
            int var18 = var13;

            while(true) {
               byte var19 = var12[var18];
               if(0 <= var19) {
                  ++var17;
               } else {
                  var17 = ((int[])((int[])var11[0]))[var17];
               }

               if(var11 != null && var11.length == 5) {
                  qca.b = null;
               }

               int var20;
               if((var20 = ((int[])((int[])var11[0]))[var17]) < 0) {
                  var14[var15++] = (byte)(~var20);
                  if(var15 >= var16) {
                     break;
                  }

                  var17 = 0;
               }

               if((var19 & 64) == 0) {
                  ++var17;
               } else {
                  var17 = ((int[])((int[])var11[0]))[var17];
               }

               if(0 > (var20 = ((int[])((int[])var11[0]))[var17])) {
                  var14[var15++] = (byte)(~var20);
                  if(var15 >= var16) {
                     break;
                  }

                  var17 = 0;
               }

               if(0 != (var19 & 32)) {
                  var17 = ((int[])((int[])var11[0]))[var17];
               } else {
                  ++var17;
               }

               if(-1 < ~(var20 = ((int[])((int[])var11[0]))[var17])) {
                  var14[var15++] = (byte)(~var20);
                  if(var16 <= var15) {
                     break;
                  }

                  var17 = 0;
               }

               if(-1 == ~(var19 & 16)) {
                  ++var17;
               } else {
                  var17 = ((int[])((int[])var11[0]))[var17];
               }

               if(0 > (var20 = ((int[])((int[])var11[0]))[var17])) {
                  var14[var15++] = (byte)(~var20);
                  if(var15 >= var16) {
                     break;
                  }

                  var17 = 0;
               }

               if((var19 & 8) != 0) {
                  var17 = ((int[])((int[])var11[0]))[var17];
               } else {
                  ++var17;
               }

               if(-1 < ~(var20 = ((int[])((int[])var11[0]))[var17])) {
                  var14[var15++] = (byte)(~var20);
                  if(var16 <= var15) {
                     break;
                  }

                  var17 = 0;
               }

               if((var19 & 4) == 0) {
                  ++var17;
               } else {
                  var17 = ((int[])((int[])var11[0]))[var17];
               }

               if((var20 = ((int[])((int[])var11[0]))[var17]) < 0) {
                  var14[var15++] = (byte)(~var20);
                  if(var16 <= var15) {
                     break;
                  }

                  var17 = 0;
               }

               if((2 & var19) == 0) {
                  ++var17;
               } else {
                  var17 = ((int[])((int[])var11[0]))[var17];
               }

               if(-1 < ~(var20 = ((int[])((int[])var11[0]))[var17])) {
                  var14[var15++] = (byte)(~var20);
                  if(var16 <= var15) {
                     break;
                  }

                  var17 = 0;
               }

               if((var19 & 1) != 0) {
                  var17 = ((int[])((int[])var11[0]))[var17];
               } else {
                  ++var17;
               }

               if((var20 = ((int[])((int[])var11[0]))[var17]) < 0) {
                  var14[var15++] = (byte)(~var20);
                  if(var16 <= var15) {
                     break;
                  }

                  var17 = 0;
               }

               ++var18;
            }

            var10 = -var13 + var18 + 1;
         }

         var7[var8] = var9 + var10;
         if(var1 < 69) {
            a(-32, (Object[])((Object[])((Object[])((Object[])f[17]))[0]));
         }

         String var22 = bta.a(0, (byte)-112, var4, var3);
         return var22;
      } catch (Exception var21) {
         return "Cabbage";
      }
   }

   static final Object[] a(Object[] var0, byte var1, int var2, Object[] var3) {
      if(var1 >= -83) {
         a((Object[])((Object[])var3[1]), ((byte[])((byte[])var0[6]))[16], ((int[])((int[])var3[8]))[5], (Object[])null);
      }

      ++b;
      lra.a(var0, 16830, var2, var3);
      return var0;
   }

   static final void a(int var0) {
      ++e;
      int var1 = 97 % ((var0 - 41) / 43);

      for(int var2 = 0; var2 < 5; ++var2) {
         ll.b[var2] = false;
      }

      jj.z = -1;
      rf.f = 0;
      hh.b = -1;
      nca.a = -1;
      ha.e = 3;
      nta.e = -1;
      mma.a = 0;
   }

}
