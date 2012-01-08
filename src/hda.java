import jaggl.OpenGL;

final class hda {

   static int e;
   static int a;
   static int f;
   static int d;
   static int b;
   static int c;


   static final boolean a(int var0, int var1, int var2) {
      if(var2 != 8) {
         return true;
      } else {
         ++a;
         return -1 != ~(52 & var0);
      }
   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      ++f;
      Object[] var3;
      synchronized(var0[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var0[0]), (long)var1));
      }

      if(null == var3) {
         byte[] var4;
         Object[] var6;
         synchronized(var0[1]) {
            var6 = (Object[])((Object[])var0[1]);
            int var7 = var1 >>> 10;
            if(var2 >= -84) {
               return (Object[])null;
            }

            int var10 = var1 & 1023;
            var4 = qn.a(var7, var10, var6, 121);
         }

         var6 = new Object[1];
         ih.a(true, var6);
         var3 = var6;
         if(null != var4) {
            bh.a(var6, jta.a((byte)-127, var4, new Object[3]), 1);
         }

         if(null != var0 && -4 == ~var0.length && var0[0].equals(Boolean.valueOf(false))) {
            return null;
         } else {
            synchronized(var0[0]) {
               il.a((long)var1, var3, true, (Object[])((Object[])var0[0]));
               return var3;
            }
         }
      } else {
         return var3;
      }
   }

   static final Object[] a(int var0, boolean var1) {
      ++b;
      if(!var1) {
         a(-52, (Object[])null, (Object[])null);
      }

      Object[][] var2 = gg.a(1);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Object[] var4 = var2[var3];
         if(~var0 == ~((int[])((int[])var4[0]))[0]) {
            return var4;
         }
      }

      return null;
   }

   static final void a(int[] var0, Object[] var1, int var2, byte var3) {
      ++c;
      int var4 = 0;
      Object[] var5 = (Object[])((Object[])((Object[])((Object[])var1[2]))[54]);
      ((int[])((int[])var5[1]))[0] = 0;
      short[] var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      if(!((boolean[])((boolean[])((Object[])((Object[])var1[2]))[17]))[11]) {
         for(var9 = 0; var2 > var9; ++var9) {
            var7 = var0[var9];
            var8 = ((int[])((int[])var1[3]))[var7];
            var6 = ((short[][])((short[][])((Object[])((Object[])var1[8]))[7]))[var7];
            if(0 != var8 && var6 != null) {
               var10 = 0;
               var11 = 0;

               while(var6.length > var11) {
                  if((1 << var10++ & var8) == 0) {
                     var11 += 3;
                  } else {
                     nua.a(var5, 1, var6[var11++] & '\uffff');
                     ++var4;
                     nua.a(var5, 1, var6[var11++] & '\uffff');
                     ++var4;
                     ++var4;
                     nua.a(var5, 1, '\uffff' & var6[var11++]);
                  }
               }

               if(null != var1 && var1.length == 1 && var1[0].equals(Integer.valueOf(1))) {
                  du.a(-23874, -24, (Object[])null);
               }
            }
         }
      } else {
         if(var1 != null && (6 == var1.length || var1.length == 2)) {
            eia.a((Object[])null, 15, 78, -106, -27919);
         }

         for(var9 = 0; var2 > var9; ++var9) {
            var7 = var0[var9];
            var6 = ((short[][])((short[][])((Object[])((Object[])var1[8]))[7]))[var7];
            var8 = ((int[])((int[])var1[3]))[var7];
            if(var8 != 0 && null != var6) {
               var10 = 0;
               var11 = 0;

               while(~var11 > ~var6.length) {
                  if((1 << var10++ & var8) == 0) {
                     var11 += 3;
                  } else {
                     ++var4;
                     eda.putShort(var5, '\uffff' & var6[var11++]);
                     ++var4;
                     eda.putShort(var5, var6[var11++] & '\uffff');
                     ++var4;
                     eda.putShort(var5, var6[var11++] & '\uffff');
                  }
               }

               if(var5 != null && -13 == ~var5.length) {
                  eia.a((Object[])null, 31, -56, 48, -27919);
               }
            }
         }
      }

      if(0 < var4) {
         cma.a(5123, (byte[])((byte[])var5[2]), (byte)70, ((int[])((int[])var5[1]))[0], (Object[])((Object[])var1[7]));
         nqa.a((Object[])((Object[])((Object[])((Object[])var1[8]))[0]), (Object[])((Object[])((Object[])((Object[])var1[8]))[3]), 20798, (Object[])((Object[])((Object[])((Object[])var1[8]))[5]), (Object[])((Object[])var1[2]), (Object[])((Object[])var1[5]));
         fn.a((7 & ((int[])((int[])((Object[])((Object[])var1[8]))[1]))[3]) != 0, (byte)-35, (((int[])((int[])((Object[])((Object[])var1[8]))[1]))[3] & 8) != 0, (Object[])((Object[])var1[2]), ((int[])((int[])var1[1]))[0]);
         if(((boolean[])((boolean[])((Object[])((Object[])var1[2]))[17]))[8]) {
            gj.a(Integer.MAX_VALUE, (Object[])((Object[])var1[6]), (Object[])((Object[])var1[2]), true);
         }

         OpenGL.glMatrixMode(5890);
         if(var1 != null && 12 == var1.length && var1[7].equals(Integer.valueOf(0))) {
            return;
         }

         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / ((float[])((float[])var1[4]))[0], 1.0F / ((float[])((float[])var1[4]))[0], 1.0F);
         OpenGL.glMatrixMode(5888);
         nqa.a((Object[])((Object[])((Object[])((Object[])var1[8]))[0]), (Object[])((Object[])((Object[])((Object[])var1[8]))[3]), 20798, (Object[])((Object[])((Object[])((Object[])var1[8]))[5]), (Object[])((Object[])var1[2]), (Object[])((Object[])var1[5]));
         kna.a(4, (Object[])((Object[])var1[7]), var4, (Object[])((Object[])var1[2]), -53, 0);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

      if(var3 < -21) {
         ;
      }
   }

   static final void a(int var0, byte[] var1, int var2, Object[] var3, int var4) {
      ++d;
      if(var0 < 14) {
         ((int[])((int[])((Object[])((Object[])var3[5]))[3]))[1] = -54;
      }

      for(int var5 = 0; var5 < var2; ++var5) {
         int var10001 = var4 + var5;
         byte[] var10002 = (byte[])((byte[])var3[2]);
         int[] var10003 = (int[])((int[])var3[1]);
         int var10006 = ((int[])((int[])var3[1]))[0];
         var10003[0] = ((int[])((int[])var3[1]))[0] + 1;
         var1[var10001] = (byte)(var10002[var10006] - ts.a((Object[])((Object[])var3[3]), 1));
      }

      if(var3 != null && (7 == var3.length && var3[2].equals(Integer.valueOf(2)) || 41 == var3.length)) {
         tg.a((Object[])null, 8553, -65);
      }

   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++e;
      jk.a(2, var2, var1);
      if(var0 < 94) {
         a(25, true);
      }

   }

}
