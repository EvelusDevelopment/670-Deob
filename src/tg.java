
final class tg extends Class_s {

   static Object[] n;
   static Object[] r = sd.a(new Object[1], 33, (byte)111);
   static int p;
   Object[] f_l;
   static Object[] m;
   static int k;
   static Object[] q = nla.a(-20, new Object[0], 7);
   static Object[] o = sd.a(new Object[1], 30, (byte)114);


   tg(Object[] var1) {
      this.f_l = var1;
   }

   static final void a(Object[] var0, int var1) {
      if(var1 > 34) {
         if(var0[1] == null) {
            var0[1] = new int[3];
         }

         ++k;
      }
   }

   static final int a(Object[] var0, int var1, int var2) {
      if(var1 != 8553) {
         return ((int[])((int[])r[1]))[10];
      } else {
         ++p;
         int var3 = ((int[])((int[])var0[1]))[1] >> 3;
         int var4 = -(((int[])((int[])var0[1]))[1] & 7) + 8;
         int var5 = 0;
         ((int[])((int[])var0[1]))[1] += var2;
         if(var0 != null && var0.length == 7) {
            return -20;
         } else {
            while(var4 < var2) {
               var5 += (vra.f[var4] & ((byte[])((byte[])var0[2]))[var3++]) << var2 + -var4;
               var2 -= var4;
               var4 = 8;
            }

            if(var4 != var2) {
               var5 += ((byte[])((byte[])var0[2]))[var3] >> -var2 + var4 & vra.f[var2];
            } else {
               var5 += ((byte[])((byte[])var0[2]))[var3] & vra.f[var4];
            }

            return var5;
         }
      }
   }

}
