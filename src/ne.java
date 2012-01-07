import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class ne extends gia implements KeyListener, FocusListener {

   static int f_l;
   static int k;
   static int j;
   static int h;
   static int f_i;
   static int e;
   static int f;
   static int g;
   static Object d;


   public final void keyReleased(KeyEvent var1) {
      kba.a(this.b, 1, var1);
      ++f_i;
   }

   public final void keyPressed(KeyEvent var1) {
      ++f;
      Object[] var2 = this.b;
      synchronized(var2) {
         kma.a((byte)26, var1, 0, var2);
      }
   }

   public final void keyTyped(KeyEvent var1) {
      ++g;
      Object[] var2 = this.b;
      synchronized(var2) {
         char var4 = var1.getKeyChar();
         if(var4 != '\uffff') {
            boolean var5;
            if((0 >= var4 || var4 >= 128) && (160 > var4 || var4 > 255)) {
               label62: {
                  if(var4 != 0) {
                     char[] var6 = mp.f_i;

                     for(int var7 = 0; var6.length > var7; ++var7) {
                        char var8 = var6[var7];
                        if(var4 == var8) {
                           var5 = true;
                           break label62;
                        }
                     }
                  }

                  var5 = false;
               }
            } else {
               var5 = true;
            }

            if(var5) {
               he.a(3, -1, false, var4, var2);
               var1.consume();
            }
         }

      }
   }

   static final void a(ya var0, int var1, Object[] var2, boolean var3, int var4) {
      ++k;
      bca var5;
      Object[] var6 = (var5 = (bca)var0) != null?var5.I:null;
      var4 += ((int[])((int[])var6[1]))[2] + 1;
      var1 += ((int[])((int[])var6[1]))[3] + 1;
      int var7 = ((int[])((int[])var2[1]))[0] * var4 + var1;
      int var8 = 0;
      int var9 = ((int[])((int[])var6[1]))[1];
      int var10 = ((int[])((int[])var6[1]))[0];
      int var11 = ((int[])((int[])var2[1]))[0] + -var10;
      int var12 = 0;
      if(!var3) {
         a((Object[])((Object[])var2[1]), -119);
      }

      int var13;
      if(var4 <= 0) {
         var13 = -var4 + 1;
         var4 = 1;
         var7 += var13 * ((int[])((int[])var2[1]))[0];
         var8 += var10 * var13;
         var9 -= var13;
      }

      if(~((int[])((int[])var2[1]))[2] >= ~(var9 + var4)) {
         var13 = 1 + var4 + var9 + -((int[])((int[])var2[1]))[2];
         var9 -= var13;
      }

      if(0 >= var1) {
         var13 = 1 + -var1;
         var12 += var13;
         var8 += var13;
         var1 = 1;
         var10 -= var13;
         var11 += var13;
         var7 += var13;
      }

      if(var1 + var10 >= ((int[])((int[])var2[1]))[0]) {
         var13 = -((int[])((int[])var2[1]))[0] + 1 + var1 + var10;
         var10 -= var13;
         var11 += var13;
         var12 += var13;
      }

      if(var10 > 0 && 0 < var9) {
         byte[] var25 = (byte[])((byte[])var2[0]);
         byte[] var14 = (byte[])((byte[])var6[2]);
         int var15 = var8;
         int var16 = var7;
         int var19 = var11;
         int var20 = var12;
         int var21 = -(var10 >> 2);
         int var17 = -(3 & var10);

         for(int var22 = -var9; var22 < 0; ++var22) {
            int var23;
            int var10001;
            for(var23 = var21; 0 > var23; ++var23) {
               var10001 = var16++;
               var25[var10001] += var14[var15++];
               var10001 = var16++;
               var25[var10001] += var14[var15++];
               var10001 = var16++;
               var25[var10001] += var14[var15++];
               var10001 = var16++;
               var25[var10001] += var14[var15++];
            }

            for(var23 = var17; 0 > var23; ++var23) {
               var10001 = var16++;
               var25[var10001] += var14[var15++];
            }

            var16 += var19;
            if(var6 != null && 4 == var6.length && var6[3].equals(Boolean.valueOf(false))) {
               ima.a((ya)null, 121, 23, new Object[2][], (byte)-57);
            }

            var15 += var20;
         }

         if(var2 == null || 1 != var2.length) {
            js.a(var1, var9, var10, var4, var2, -1);
         }
      }
   }

   public final void focusLost(FocusEvent var1) {
      ++j;
      qla.a(this.b, var1, (byte)95);
   }

   static final void a(Object[] var0, int var1) {
      if(var0[1] == null) {
         var0[1] = new int[7];
      }

      int var2 = -71 / ((var1 - 43) / 37);
      ++e;
      if(null == var0[3]) {
         var0[3] = new boolean[4];
      }

      if(null == var0[6]) {
         var0[6] = new float[2];
      }

   }

   ne(Object[] var1) {
      super(var1);
   }

   static final jj a(int var0, Object[] var1) {
      ++h;
      if(var0 != 14938) {
         a((Object[])null, 80);
      }

      return new jj(var1);
   }

   public final void focusGained(FocusEvent var1) {
      ++f_l;
      vs.a(true, var1, this.b);
   }

}
