
final class hba {

   static int b;
   static int a;
   static int c;
   static int e;
   static int d;


   static final void a(Object[] var0, int var1, int var2) {
      ++b;
      ((int[])((int[])var0[1]))[0] = var1;
      if(var2 != 12476) {
         a((Object[])null, 24, ((int[])((int[])var0[0]))[12]);
      }

   }

   static final int a(Object[] var0, int var1) {
      ++c;
      return var1 != 0?67:((int[])((int[])var0[1]))[0];
   }

   static final Object[] a(int var0, int var1, Object[] var2, int var3, int var4, int var5, float var6, int var7) {
      ++d;
      if(var7 != -2) {
         return new Object[0];
      } else {
         hga.a(var2, false);
         bi.a(var2, var0, var5, var3, var4, var1, 0);
         var2[4] = new int[((int[])((int[])var2[1]))[0]];

         for(int var8 = 0; ((int[])((int[])var2[1]))[0] > var8; ++var8) {
            ((int[])((int[])var2[4]))[var8] = (short)((int)(4096.0D * Math.pow((double)var6, (double)var8)));
         }

         return null != var2 && var2.length == 11?null:var2;
      }
   }

   static final Object[] a(boolean var0, String var1, byte var2, Object[] var3) {
      ++a;
      int var4 = dla.a(var3, 85, var1);
      if(var4 == -1) {
         return vd.a(0, false, new Object[3]);
      } else {
         if(var2 != 105) {
            ((int[])((int[])var3[22]))[1] = -45;
         }

         int[] var5 = nr.a(false, var3, var4);
         if(null != var3 && (-2 == ~var3.length || -5 == ~var3.length && var3[1].equals(Integer.valueOf(0)) && var3[1].equals(Boolean.valueOf(false)))) {
            return null;
         } else {
            Object[] var6 = vd.a(var5.length, false, new Object[3]);
            int var7 = 0;
            int var8 = 0;

            while(((int[])((int[])var6[1]))[0] > var7) {
               Object[] var9 = jta.a((byte)-114, qn.a(var4, var5[var8++], var3, 76), new Object[3]);
               int var10 = lr.a(var2 ^ 104, var9);
               int var11 = de.a(var2 ^ 105, var9);
               int var12 = fh.a(var9, false);
               if(!var0 && 1 == var12) {
                  --((int[])((int[])var6[1]))[0];
               } else {
                  ((int[])((int[])var6[2]))[var7] = var10;
                  ((int[])((int[])var6[0]))[var7] = var11;
                  ++var7;
               }
            }

            return var6;
         }
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4) {
      ++e;
      ((int[])((int[])var3[40]))[var2] = var4;
      ((int[])((int[])var3[37]))[var2] = var0;
      if(var1 >= 126) {
         ;
      }
   }

}
