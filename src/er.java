
final class er {

   private static short[] m = new short[500];
   int q = 0;
   boolean f_i = false;
   private static short[] g = new short[500];
   short[] a;
   private static short[] n = new short[500];
   private static short[] d = new short[500];
   private static short[] c = new short[500];
   boolean k = false;
   short[] b;
   boolean f_l = false;
   private static byte[] o = new byte[500];
   short[] p;
   Object[] h = null;
   short[] j;
   byte[] f;
   short[] e;


   er(byte[] var1, Object[] var2) {
      this.h = var2;

      try {
         Object[] var3 = jta.a((byte)-119, var1, new Object[3]);
         Object[] var4 = jta.a((byte)-88, var1, new Object[3]);
         fh.a(var3, false);
         ((int[])((int[])var3[1]))[0] += 2;
         int var5 = fh.a(var3, false);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         ((int[])((int[])var4[1]))[0] = ((int[])((int[])var3[1]))[0] + var5;

         int var9;
         for(var9 = 0; var9 < var5; ++var9) {
            int var10 = ((int[])((int[])this.h[2]))[var9];
            if(var10 == 0) {
               var7 = var9;
            }

            int var11 = fh.a(var3, false);
            if(var11 > 0) {
               if(var10 == 0) {
                  var8 = var9;
               }

               d[var6] = (short)var9;
               short var12 = 0;
               if(var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if((var11 & 1) != 0) {
                  g[var6] = (short)kua.a((int)-98, var4);
               } else {
                  g[var6] = var12;
               }

               if((var11 & 2) != 0) {
                  c[var6] = (short)kua.a((int)-97, var4);
               } else {
                  c[var6] = var12;
               }

               if((var11 & 4) != 0) {
                  m[var6] = (short)kua.a((int)-89, var4);
               } else {
                  m[var6] = var12;
               }

               o[var6] = (byte)(var11 >>> 3 & 3);
               if(var10 == 2 || var10 == 9) {
                  g[var6] = (short)(g[var6] << 2 & 16383);
                  c[var6] = (short)(c[var6] << 2 & 16383);
                  m[var6] = (short)(m[var6] << 2 & 16383);
               }

               n[var6] = -1;
               if(var10 != 1 && var10 != 2 && var10 != 3) {
                  if(var10 == 5) {
                     this.f_i = true;
                  } else if(var10 == 7) {
                     this.f_l = true;
                  } else if(var10 == 9 || var10 == 10 || var10 == 8) {
                     this.k = true;
                  }
               } else if(var7 > var8) {
                  n[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if(((int[])((int[])var4[1]))[0] != var1.length) {
            throw new RuntimeException();
         }

         this.q = var6;
         this.j = new short[var6];
         this.e = new short[var6];
         this.b = new short[var6];
         this.p = new short[var6];
         this.a = new short[var6];
         this.f = new byte[var6];

         for(var9 = 0; var9 < var6; ++var9) {
            this.j[var9] = d[var9];
            this.e[var9] = g[var9];
            this.b[var9] = c[var9];
            this.p[var9] = m[var9];
            this.a[var9] = n[var9];
            this.f[var9] = o[var9];
         }
      } catch (Exception var13) {
         this.q = 0;
         this.f_i = false;
         this.f_l = false;
      }

   }

}
