
final class iaa {

   static int e;
   static int g;
   static Object[] c = sl.a("3", 0, new Object[1], "3");
   static int a;
   static Object[] f = ed.a(6, new Object[1], (byte)-127, 51);
   static int d;
   static cga b;


   static final void a(boolean var0) {
      if(lca.j != -1) {
         tw.a(-1, -1, lca.j, !var0, false);
         lca.j = -1;
      }

      if(!var0) {
         ++a;
      }
   }

   static final void a(boolean var0, boolean var1, boolean var2, gi var3, int var4, boolean var5, String var6, String var7, boolean var8) {
      ++e;
      if(!var8) {
         via.a(false, var3, var7, 3);
      } else if(!var0) {
         if(mna.h.startsWith("win") && !var5) {
            via.a(false, var3, var7, 0);
            return;
         }

         if(mna.h.startsWith("mac") && var2 && var1) {
            era.a(var7, 1416, var6, 1, var3);
            return;
         }

         via.a(false, var3, var7, 2);
      } else {
         via.a(false, var3, var7, 4);
      }

      if(var4 != -1) {
         f = (Object[])null;
      }

   }

   static final boolean a(Object[] var0, Object[] var1, Object[] var2, int var3, lh var4, boolean var5) {
      ++g;
      synchronized(var2) {
         var4.b();
         boolean var12 = var5;
         int[] var13 = null;
         if(var3 > 0) {
            var13 = new int[]{var3};
         }

         kga var7;
         kga var8;
         for(Object[] var14 = null != (var7 = (kga)qt.a(0, var4.j))?var7.k:null; null != var14; var14 = null == (var8 = (kga)nda.a(1, var4.j))?null:var8.k) {
            int var15 = (int)((lm)(var14 != null?var14[0]:null)).e;
            hka var10;
            Object[] var16 = null == (var10 = (hka)pm.a((long)var15, (Object[])((Object[])var2[2]), false))?null:var10.p;
            if(null == var16) {
               byte[] var18 = fd.a(-2, var15, var0);
               Object[] var17;
               if(var18 == null) {
                  var17 = null;
               } else {
                  var17 = fca.a(new Object[9], var18, (byte)-118);
               }

               var16 = var17;
               if(var17 == null) {
                  var12 = false;
                  continue;
               }

               Object[] var11;
               di.a((Object[])((Object[])var2[2]), var5, (lm)(null == (var11 = var17)?null:var11[5]), (long)var15);
            }

            if(!fp.a(42, var16, (byte[])((byte[])var14[1]), var13, var1)) {
               var12 = false;
            }
         }

         if(var12) {
            var4.a();
         }

         return var12;
      }
   }

   static final void a(Object[] var0, int var1) throws Throwable {
      ++d;
      if(((long[])((long[])var0[2]))[0] != 0L) {
         el.a((Object[])((Object[])var0[0]), var1 ^ -119, ((long[])((long[])var0[2]))[0]);
         ((long[])((long[])var0[2]))[0] = 0L;
      }

      ((bq)var0[5]).a(-113);
      if(var1 != -1) {
         a(true);
      }

   }

}
