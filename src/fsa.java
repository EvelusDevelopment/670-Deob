import jagtheora.ogg.OggStreamState;

final class fsa {

   static int d;
   static int h;
   static int e;
   static int c;
   static int f;
   static int a;
   static Object[] g = null;
   static int b;


   static final void a(int var0, Object[] var1, int var2) {
      ((int[])((int[])var1[1]))[2] = (var0 & 16711680) >> 12;
      if(var2 != 5) {
         ((int[])((int[])var1[0]))[1] = ((int[])((int[])((Object[])((Object[])var1[6]))[4]))[0];
      }

      ++f;
      ((int[])((int[])var1[1]))[1] = var0 >> 4 & 4080;
      ((int[])((int[])var1[1]))[3] = 4080 & var0 << 4;
   }

   static final void a(Object[] var0, int[] var1, int var2, boolean var3, int var4) {
      ++a;
      ((jua)var0[2]).b(var1, var2, var4);
      if(!var3) {
         a((Object[])null, (int[])null, 80, ((boolean[])((boolean[])((Object[])((Object[])var0[19]))[0]))[1], -20);
      }

      mt var5;
      mt var6;
      for(Object[] var9 = null == (var5 = (mt)dda.a((Object[])((Object[])var0[0]), 2))?null:var5.n; null != var9; var9 = null == (var6 = (mt)client.a((Object[])((Object[])var0[0]), -28280))?null:var6.n) {
         if(!se.a((Object[])((Object[])var0[3]), var9, 125)) {
            if(null != var0 && (var0.length == 7 && var0[1].equals(Boolean.valueOf(false)) || -2 == ~var0.length)) {
               ps.a(90, (Object[])null);
            }

            int var7 = var2;
            int var8 = var4;

            while(true) {
               if(((int[])((int[])var9[1]))[5] < var8) {
                  cd.a(var7, var1, var0, ((int[])((int[])var9[1]))[5], var7 + var8, var9, -113);
                  var8 -= ((int[])((int[])var9[1]))[5];
                  var7 += ((int[])((int[])var9[1]))[5];
                  if(!kb.a(var8, var9, var1, (Object[])((Object[])var0[3]), var7, 32)) {
                     continue;
                  }
                  break;
               }

               cd.a(var7, var1, var0, var8, var8 + var7, var9, -99);
               ((int[])((int[])var9[1]))[5] -= var8;
               break;
            }
         }
      }

   }

   static final void a(int var0, Object[] var1, int var2, byte var3, int var4, int var5) {
      if(!((boolean[])((boolean[])var1[2]))[0]) {
         ((boolean[])((boolean[])var1[2]))[0] = true;
         if(-1 < ~((int[])((int[])var1[1]))[0]) {
            var1[3] = gu.a((byte)92, 25, new Object[43]);
            kw.b(-122, (Object[])((Object[])var1[3]), ew.f_l);
            ((int[])((int[])((Object[])((Object[])var1[3]))[12]))[15] = dsa.b++;
            ((int[])((int[])((Object[])((Object[])var1[3]))[12]))[33] = kda.d;
            ((int[])((int[])((Object[])((Object[])var1[3]))[12]))[21] = ((int[])((int[])var1[1]))[1];
         } else {
            var1[0] = joa.a(new Object[43], 2, 25);
            ((int[])((int[])((Object[])((Object[])var1[0]))[12]))[21] = ((int[])((int[])var1[1]))[1];
            ((int[])((int[])((Object[])((Object[])var1[0]))[12]))[33] = kda.d;
            tq.a((Object[])((Object[])var1[0]), jra.a((byte)-122, ((int[])((int[])var1[1]))[0], nt.f_i), -1);
            so.a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[0]))[42]))[1]))[18], (byte)51, (Object[])((Object[])var1[0]));
            ((int[])((int[])((Object[])((Object[])var1[0]))[12]))[15] = dsa.b++;
            ((int[])((int[])((Object[])((Object[])var1[0]))[12]))[27] = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[0]))[42]))[1]))[30] << 3;
         }
      }

      ++e;
      if(-1 >= ~((int[])((int[])var1[1]))[0]) {
         el.a(var0, true, 108, var4, (Object[])((Object[])var1[0]), var5, dg.a(-96, (Object[])((Object[])var1[0])));
         dd.a((byte)0, true, var2, (Object[])((Object[])var1[0]));
      } else {
         ((byte[])((byte[])((Object[])((Object[])var1[3]))[10]))[0] = ((byte[])((byte[])((Object[])((Object[])var1[3]))[10]))[1] = (byte)var0;
         ul.a(0, var4, (Object[])((Object[])var1[3]), var5);
         dd.a((byte)0, true, var2, (Object[])((Object[])var1[3]));
      }

      if(var3 <= 37) {
         a(((int[])((int[])((Object[])((Object[])var1[1]))[6]))[17], (Object[])null, ((int[])((int[])g[0]))[1], ((byte[])((byte[])((Object[])((Object[])g[0]))[4]))[0], ((int[])((int[])var1[42]))[3], ((int[])((int[])g[9]))[5]);
      }

   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[11]) {
         var0[11] = new boolean[2];
      }

      if(var1 == 33) {
         if(var0[1] == null) {
            var0[1] = new int[8];
         }

         ++b;
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 16711680) {
         return 75;
      } else {
         ++c;
         return ((int[])((int[])var0[1]))[0];
      }
   }

   static final Object[] a(int var0, Object[] var1, OggStreamState var2) {
      dta.a(107, var1);
      ++d;
      Class_ls var4 = new Class_ls(var1);
      var1[2] = var2;
      var1[var0] = var4;
      return var1;
   }

}
